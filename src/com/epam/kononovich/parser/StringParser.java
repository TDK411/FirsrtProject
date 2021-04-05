package com.epam.kononovich.parser;

import com.epam.kononovich.exception.ArrayException;
import com.epam.kononovich.validator.StringValidator;

public class StringParser {
    public static int[] StringParser(String read) throws ArrayException{
        boolean flag =StringValidator.ValidatorChecking(read);
        if(flag){
            String[] nums=read.split(" ");
            int[] massive=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                try {
                    massive[i]=Integer.parseInt(nums[i]);   
                } catch (NumberFormatException e) {
                    throw new ArrayException("Not a mumber", e);
                }   
            }
            return massive;
        }
        else{
            throw new ArrayException("String in file is invalid");
        }
    }
    
}

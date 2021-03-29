package com.epam.kononovich.service;

import com.epam.kononovich.entity.ArrayEntity;
import com.epam.kononovich.exception.ArrayException;

public final class SumOfArray {
    public static int SumOfArray(ArrayEntity ArrayEntity) throws ArrayException{
        int sum=0;
        for(int i=0;i<ArrayEntity.GetSize();i++){
            sum+=ArrayEntity.GetVariable(i);
        }
        return sum;
    }
}

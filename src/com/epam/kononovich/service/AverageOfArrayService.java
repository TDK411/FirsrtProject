package com.epam.kononovich.service;

import com.epam.kononovich.entity.ArrayEntity;
import com.epam.kononovich.exception.ArrayException;


public final class AverageOfArray {
    public static int AverageOfArray(ArrayEntity ArrayEntity) throws ArrayException{
        int sum=0;
        for(int i=0;i<ArrayEntity.GetSize();i++){
            sum+=ArrayEntity.GetVariable(i);
        }
        sum/=ArrayEntity.GetSize();
        return sum;
    }
}

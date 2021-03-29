package com.epam.kononovich.service;

import com.epam.kononovich.entity.ArrayEntity;
import com.epam.kononovich.exception.ArrayException;


public final class MinMax {
    public static int MinMax(ArrayEntity ArrayEntity, boolean flag) throws ArrayException{
        int answer=ArrayEntity.GetVariable(0);
        if (flag==false){
            for(int i=1;i<ArrayEntity.GetSize();i++){
                if(answer>ArrayEntity.GetVariable(i))
                {
                    answer=ArrayEntity.GetVariable(i);
                }
            }
        }
            else{
                for(int i=1;i<ArrayEntity.GetSize();i++){
                    if(answer<ArrayEntity.GetVariable(i))
                    {
                        answer=ArrayEntity.GetVariable(i);
                    }
                }   
            }
            return answer;
    }
    }

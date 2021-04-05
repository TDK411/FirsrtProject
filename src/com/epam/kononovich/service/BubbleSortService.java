package com.epam.kononovich.service;

import com.epam.kononovich.entity.ArrayEntity;

public final class BubbleSortService {
    public static ArrayEntity BubbleSort(ArrayEntity arrayEntity, boolean flag){
        int[] sort=arrayEntity.GetArray();
            for(int i=0;i<sort.length;i++){
                for(int j=i+1;j<sort.length;j++){
                    if(sort[i]<sort[j]){
                        if(flag){
                        int swap=sort[i];
                        sort[i]=sort[j];
                        sort[j]=swap;
                    }
                }
                }
            }
        arrayEntity.SetArray(sort);
        return arrayEntity;
    }
}

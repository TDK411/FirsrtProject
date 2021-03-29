package com.epam.kononovich.entity;

import java.util.Arrays;
import java.util.Objects;
import com.epam.kononovich.exception.ArrayException;

public class ArrayEntity {
   private int[] array;


    public ArrayEntity(int ... num){
        array=num;
    }

    public ArrayEntity(int size)throws ArrayException {
        if(size<0){
            throw new ArrayException("number must be positive");
        }
        array=new int[size];
    }

    public int GetSize(){
        return array.length;
    }

    public int hashCode(){
        int result=Objects.hashCode(array.length);
        return 31*result+Arrays.hashCode(array);
    }

    public String toString(){
        return "array= {"+Arrays.toString(array)+"} lenght="+ Integer.toString(array.length);
    }

    public void SetArray(int[] array){
        this.array=Arrays.copyOf(array, array.length);
    }

    public int[] GetArray(){
        return Arrays.copyOf(this.array, this.array.length);
    }

    public int GetVariable(int index) throws ArrayException{
        if(index>GetSize()){
            throw new ArrayException("index bigger than size");
        }
        return this.array[index];
    }
}
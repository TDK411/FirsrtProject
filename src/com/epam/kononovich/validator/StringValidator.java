package com.epam.kononovich.validator;

public final class StringValidator {
        public static final String REG_EX_STRING="(\\-?\\d+(\\s+|\\s+\\-\\s+|,\\s+|$))*";
        public static boolean ValidatorChecking(String regex){
            boolean flag=false;
            if(regex.matches(REG_EX_STRING)){
                flag=true;

            }
            return flag;
        }
}

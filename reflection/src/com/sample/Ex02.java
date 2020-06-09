package com.sample;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex02 {

    public static void main(String[] args) throws Exception {
        
        PetPerson petPerson = new PetPerson( "me" );
        List<Pet>[] petArray = petPerson.getPetArray();
        
        Method method = PetPerson.class.getMethod("getPetArray", null);
        System.out.println(method);
        
        Type returnType = method.getReturnType();
        
        System.out.println("returnType : " + returnType);
        System.out.println("returnType.getClass() : " + returnType.getClass());

        
        Type genericReturnType = method.getGenericReturnType();

        System.out.println("genericReturnType : " + genericReturnType);
        System.out.println("genericReturnType.getClass() : " + genericReturnType.getClass());

//        System.out.println(parameterizedType);
//        System.out.println(parameterizedType.getRawType().getTypeName());
//
//        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
//        for (Type type : actualTypeArguments) {
//            System.out.println(type);
//        }
//        
//        
//        Method method2 = petPerson.getClass().getMethod("getPets", null);
//        
//        System.out.println(method2);
//        
//        ParameterizedType parameterizedType2 = (ParameterizedType)method2.getGenericReturnType();
//        
//        System.out.println(parameterizedType2);
    }
    
    

}

package com.sample;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ex01 {

    public static void main(String[] args) throws Exception {
        
        PetPerson petPerson = new PetPerson( "me" );
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("Dog", new Pet( Pet.PetType.dog ));
        petMap.put("Cat", new Pet( Pet.PetType.cat ));
        petPerson.setPets( petMap );
        
        Collection<Pet> values = petPerson.getPets().values();
        
        System.out.println(values);
        
        
        Method method = petMap.getClass().getMethod("values", null);
        
        System.out.println(method);
        
        Class<?> returnType = method.getReturnType();
        System.out.println("returnType : " + returnType);
        System.out.println("returnType.getClass() : " + returnType.getClass());
        
        Type genericReturnType = method.getGenericReturnType();

        System.out.println("genericReturnType : " + genericReturnType);
        System.out.println("genericReturnType.getClass() : " + genericReturnType.getClass());
        
        ParameterizedType parameterizedType = (ParameterizedType)genericReturnType;
        System.out.println(parameterizedType);
        System.out.println(parameterizedType.getRawType().getTypeName());

        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (Type type : actualTypeArguments) {
            System.out.println(type);
        }
        
        
        Method method2 = petPerson.getClass().getMethod("getPets", null);
        
        System.out.println(method2);
        
        ParameterizedType parameterizedType2 = (ParameterizedType)method2.getGenericReturnType();
        
        System.out.println(parameterizedType2);
    }
    
    

}

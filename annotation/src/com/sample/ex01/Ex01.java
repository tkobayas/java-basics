package com.sample.ex01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {

    public static void main(String[] args) {

        Class clazz = Person.class;
        Annotation[] declaredAnnotations = clazz.getAnnotations(); // getDeclaredAnnotations() returns non-inherited Annotations
        dump(declaredAnnotations);
        
        Field[] declaredFields = clazz.getDeclaredFields();
        Annotation[] declaredAnnotations2 = declaredFields[0].getAnnotations();
        dump(declaredAnnotations2);
        
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Annotation[] declaredAnnotations3 = declaredMethods[0].getAnnotations();
        dump(declaredAnnotations3);
    }

    private static void dump(Annotation[] declaredAnnotations) {
        for (Annotation annotation : declaredAnnotations) {
            System.out.println(annotation);
            if (annotation instanceof MyAnnotation) {
                System.out.println("  " + ((MyAnnotation)annotation).value());
            }
        }
    }
}

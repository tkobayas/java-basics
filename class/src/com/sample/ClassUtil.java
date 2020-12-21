package com.sample;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

public class ClassUtil {

    public static void main(String[] args) {
        
        
        Collection<String> cl = new ArrayList<>();
        
        
        System.out.println(cl.getClass());
        
        System.out.println(toRawClass(cl.getClass()));

        
    }
    
    public static Class<?> toRawClass(Type type) {
        if (type == null) {
            return null;
        }
        if (type instanceof Class<?>) {
            return ( Class ) type;
        }
        if (type instanceof ParameterizedType ) {
            return toRawClass( (( ParameterizedType ) type).getRawType() );
        }
        if (type instanceof TypeVariable ) {
            return Object.class;
        }
        throw new UnsupportedOperationException( "Unknown type " + type );
    }

}

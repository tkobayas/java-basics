package com.sample;

import java.util.Calendar;
import java.util.Date;

public class Ex01Calendar {

    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        
        System.out.println(date);
        
        Date date2 = new Date();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        
        System.out.println(calendar2);
    }
}

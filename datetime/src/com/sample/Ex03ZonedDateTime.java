package com.sample;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex03ZonedDateTime {

    public static void main(String[] args) {
        

        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime);
        
        ZonedDateTime dateTimeGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(dateTimeGMT);
    }
}

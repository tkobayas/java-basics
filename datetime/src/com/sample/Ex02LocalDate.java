package com.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex02LocalDate {

    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        
       
        ZonedDateTime zonedDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0).atZone(ZoneId.of("UTC"));
        System.out.println(zonedDateTime);
        long epochSconds = zonedDateTime.toInstant().getEpochSecond();
        System.out.println(epochSconds);
    }
}

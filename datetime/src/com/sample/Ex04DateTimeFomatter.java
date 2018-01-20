package com.sample;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Ex04DateTimeFomatter {

    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")));

        System.out.println();
        
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        
        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        System.out.println();

        //-----------------------------
        
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        TemporalAccessor parsed = newFormatter.parse("2017/12/31 11:11:11.100");
        LocalDateTime parsedLocalDate = LocalDateTime.from(parsed);
        System.out.println(parsedLocalDate);
        
        System.out.println();
        
        DateTimeFormatter newFormatterForZoned = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS zzz");
        TemporalAccessor parsedZoned = newFormatterForZoned.parse("2017/12/31 11:11:11.100 JST");
        ZonedDateTime parsedZonedDate = ZonedDateTime.from(parsedZoned);
        System.out.println(parsedZonedDate);
    }
}

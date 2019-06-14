package com.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Ex05DateFomatter {

    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

        System.out.println();
        

        //-----------------------------
        
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        TemporalAccessor parsed = newFormatter.parse("2018-12-31");
        LocalDate parsedLocalDate = LocalDate.from(parsed);
        System.out.println(parsedLocalDate);
        
        System.out.println();
        
    }
}

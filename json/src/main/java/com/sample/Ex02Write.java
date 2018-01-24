package com.sample;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex02Write {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        
        Employee employee = new Employee();
        employee.setName("Paul McCartney");
        employee.setAge(33);
        employee.setLicenses(Arrays.asList("License3", "License4"));
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("newEmployee.json"), employee);
    }
}

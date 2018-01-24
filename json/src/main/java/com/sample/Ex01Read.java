package com.sample;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex01Read {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        File file = new File("employee.json");
        ObjectMapper mapper = new ObjectMapper();
        Employee employee = mapper.readValue(file, Employee.class);
        
        System.out.println(employee);
    }
}

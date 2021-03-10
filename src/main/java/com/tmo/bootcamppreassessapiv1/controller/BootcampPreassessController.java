package com.tmo.bootcamppreassessapiv1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController

public class BootcampPreassessController {


    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<String>
    getResponse(){

        return new ResponseEntity<>("Hi There.. This is a Get Sum App.", HttpStatus.OK);
    }

    @GetMapping(value = "/{num1}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<HashMap<String, String>> getSumWithTen(@PathVariable long num1){
        HashMap<String, String> map = new HashMap<>();
            map.put("sum", String.valueOf(num1 + 10));

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping(value = "/{num1}/{num2}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<HashMap<String, String>> getSum(@PathVariable long num1, @PathVariable long num2){
        HashMap<String, String> map = new HashMap<>();
               map.put("sum", String.valueOf(num1 + num2));

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}

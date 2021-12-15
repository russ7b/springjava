package com.CSB.samplefullstack.controller;

import com.CSB.samplefullstack.computations.Computation;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/greet")
@CrossOrigin("*")
public class Greet {

    @RequestMapping("/hello")
    public String hello(){
        return "hello" + Computation.sumOfTwoNums();
    }

    @RequestMapping("/yo")
    public String yo(){
        return "YO";
    }

}

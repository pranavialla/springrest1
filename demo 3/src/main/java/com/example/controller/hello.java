package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class hello
{
    @GetMapping("/gethello")
    public String  gethello()
    {
        return "Hello get method";
    }
}
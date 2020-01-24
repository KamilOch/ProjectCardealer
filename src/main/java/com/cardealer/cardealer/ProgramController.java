package com.cardealer.cardealer;

import org.springframework.stereotype.Controller;

@Controller
public class ProgramController {

   // @GetMapping("/")
    public String hello() {
        return "hello";
    }
}

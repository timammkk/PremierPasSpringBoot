package com.example.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dic_student_name")
public class SbCarController {
    @Value("${fullname:Fatima Mamadou KANE}")
    private String fullname;

    @GetMapping
    public String getFullname() {
        return "Work done by " + fullname + " !";
    }
}
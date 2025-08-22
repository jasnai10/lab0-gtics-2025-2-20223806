package com.pucp.lab020252.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PetController {
    @GetMapping("/pets")
    public String getPets() {
        List<String> pets = List.of("Dog", "Cat",  "Bird");
        return "pets";
    }
}

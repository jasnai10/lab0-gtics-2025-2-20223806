package com.pucp.lab020252.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetController {
    @GetMapping("/pets")
    public String getPets() {
        return "pets";
    }
}

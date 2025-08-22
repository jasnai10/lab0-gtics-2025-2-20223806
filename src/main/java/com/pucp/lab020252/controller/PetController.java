package com.pucp.lab020252.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class PetController {
    @GetMapping("/pets")
    public String getPets() {
        log.info("Pet controller accessed");
        List<String> pets = List.of("Dog", "Cat",  "Bird");
        return "pets";
    }

}

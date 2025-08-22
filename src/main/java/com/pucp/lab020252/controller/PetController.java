package com.pucp.lab020252.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PetController {
    @GetMapping("/pets")
    public String getPtets() {
        log.info("Pet controller accessed");
        return "pets";
    }

}

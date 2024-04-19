package com.example.plantio.api;

import org.springframework.web.bind.annotation.*;

/**
 * @author marcos
 */

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String get(){
        return "API ErthTech";
    }


}

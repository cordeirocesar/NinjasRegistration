package com.cesarcordeiro.NinjasRegistration.ninjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello World";
    }


}

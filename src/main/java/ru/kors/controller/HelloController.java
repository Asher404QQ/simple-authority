package ru.kors.controller;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public String hello(Authentication authentication) {
        return "Hello, " + authentication.getName() + " " + authentication.getAuthorities();
    }

    @PostMapping("/hello")
    public String helloConcat(@RequestBody String message) {
        return "Hello! " + message;
    }

    @GetMapping("/translate/aloha")
    public String aloha(Authentication authentication) {
        return "Aloha, " + authentication.getName() + " " + authentication.getAuthorities();
    }

    @GetMapping("/hola")
    public String hola() {
        return "Hola, ";
    }

}

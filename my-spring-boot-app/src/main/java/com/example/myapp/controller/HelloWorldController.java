package com.example.myapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    /**
     * Retrieves a greeting message.
     *
     * @return ResponseEntity<Object> - The response entity containing the greeting
     *         message as a JSON object.
     */
    @GetMapping("/hello")
    public ResponseEntity<Object> sayHello() {
        String message = "Hello, World!";
        return ResponseEntity.status(HttpStatus.OK).body("{\"message\": \"" + message + "\"}");
    }

    @GetMapping("/bye")
    public ResponseEntity<Object> sayBye() {
        String message = "Goodbye!";
        return ResponseEntity.status(HttpStatus.OK).body("{\"message\": \"" + message + "\"}");
    }
}

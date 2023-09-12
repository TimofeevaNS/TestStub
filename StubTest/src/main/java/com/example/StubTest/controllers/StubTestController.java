package com.example.StubTest.controllers;

import com.example.StubTest.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class StubTestController {
    @GetMapping("/stubtest")
    public ResponseEntity<User> getQuery(){
    return ResponseEntity.ok(new User("login", "passwd"));
    }

    @PostMapping("/stubtest")
    public ResponseEntity<User> postQuery(@RequestBody User user){
        LocalDate date = LocalDate.now();
        if (user.getLogin() == null || user.getLogin().isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

        if (user.getPasswd() == null || user.getPasswd().isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

        user.setDate(date.toString());
        return ResponseEntity.ok(user);
    }
}

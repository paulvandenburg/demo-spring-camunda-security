package com.example.demosecurity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoResource {

    @PostMapping("/open")
    public ResponseEntity<Object> openPost() {
        return ResponseEntity.ok("open post");
    }

    @GetMapping("/open")
    public ResponseEntity<Object> openGet() {
        return ResponseEntity.ok("open get");
    }

    @PostMapping("/closed")
    public ResponseEntity<Object> closedPost() {
        return ResponseEntity.ok("closed post");
    }

    @GetMapping("/closed")
    public ResponseEntity<Object> closedGet() {
        return ResponseEntity.ok("closed get");
    }
}

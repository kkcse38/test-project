package com.example.testproject.controller;

import com.example.testproject.model.DateModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateController {

    @PostMapping("/api/test")
    public ResponseEntity<?> consumeDate(@RequestBody final DateModel dateModel){
        return ResponseEntity.ok(dateModel);
    }
}

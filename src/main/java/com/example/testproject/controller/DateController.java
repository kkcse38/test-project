package com.example.testproject.controller;

import com.example.testproject.model.DateModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

@RestController
public class DateController {

    @PostMapping("/api/test")
    public ResponseEntity<?> consumeDate(@RequestBody final DateModel dateModel){
        final LocalDate localDate = dateModel.getDate().toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();
        final Map<String, Object> dateMap = Map
                        .of("Year",localDate.getYear(),
                        "Month",localDate.getMonth(),
                        "Day", localDate.getDayOfMonth());
        return ResponseEntity.ok(dateMap);
    }
}

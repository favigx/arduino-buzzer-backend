package com.distancebuzzerbackend.distancebuzzerbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.distancebuzzerbackend.distancebuzzerbackend.model.BuzzerData;
import com.distancebuzzerbackend.distancebuzzerbackend.service.BuzzerDataService;

@CrossOrigin(origins = "*")
@RestController
public class BuzzerDataController {

    private BuzzerDataService buzzerDataService;

    public BuzzerDataController(BuzzerDataService buzzerDataService) {
        this.buzzerDataService = buzzerDataService;
    }

    @GetMapping("/allbuzzerdata")
    public List<BuzzerData> getAllBuzzerData() {
        return buzzerDataService.getAllBuzzerData();
    }

    @PostMapping("/buzzerdata")
    public BuzzerData addBuzzerData(@RequestBody BuzzerData buzzerData) {
        return buzzerDataService.addBuzzerData(buzzerData);
    }
}
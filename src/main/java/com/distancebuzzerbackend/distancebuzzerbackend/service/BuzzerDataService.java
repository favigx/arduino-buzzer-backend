package com.distancebuzzerbackend.distancebuzzerbackend.service;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.distancebuzzerbackend.distancebuzzerbackend.model.BuzzerData;

@Service
public class BuzzerDataService {

    private final MongoOperations mongoOperations;

    public BuzzerDataService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public BuzzerData addBuzzerData(BuzzerData buzzerData) {
        return mongoOperations.insert(buzzerData);

    }

    public List<BuzzerData> getAllBuzzerData() {
        return mongoOperations.findAll(BuzzerData.class);
    }
}
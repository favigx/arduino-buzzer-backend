package com.distancebuzzerbackend.distancebuzzerbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BuzzerData")
public class BuzzerData {
    @Id
    private String buzzerDataId;
    private int buzzCount;
    private String timestamp;
    private String date;

    public BuzzerData(String buzzerDataId, int buzzCount, String timestamp, String date) {
        this.buzzerDataId = buzzerDataId;
        this.buzzCount = buzzCount;
        this.timestamp = timestamp;
        this.date = date;
    }

    public String getBuzzerDataId() {
        return buzzerDataId;
    }

    public void setBuzzerDataId(String buzzerDataId) {
        this.buzzerDataId = buzzerDataId;
    }

    public int getBuzzCount() {
        return buzzCount;
    }

    public void setBuzzCount(int buzzCount) {
        this.buzzCount = buzzCount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
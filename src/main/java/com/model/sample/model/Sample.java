package com.model.sample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sample {
    private String sampleNo;


    public String getSampleNo() {
        return sampleNo;
    }

    public void setSampleNo(String sampleNo) {
        this.sampleNo = sampleNo;
    }


}

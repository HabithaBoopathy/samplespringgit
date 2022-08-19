package com.model.sample.repository;

import com.model.sample.model.Sample;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleRepository extends MongoRepository<Sample,String> {
    @Query(value="{sampleNo : ?0}")
    Sample findBySampleNo(String no);
    


}

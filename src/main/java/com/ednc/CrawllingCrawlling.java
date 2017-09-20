package com.ednc;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class CrawllingCrawlling {

    private static final String JOB_NAME = "jobName";

    @Autowired
    private JobBuilderFactory jobBuilderFactory;


    @Bean
    public Job job() {
        return jobBuilderFactory.get(JOB_NAME)
            .start(streetStep())
            .build();
    }

    @Bean
    public Step streetStep() {
//        return stepBuilderFactory.get("street-address")
//                                 .<AddressStreet, AddressStreet> chunk(getChunkSize())
//                                 .reader(streetReader())
//                                 .writer(streetWriter())
//                                 .taskExecutor(taskExecutor)
//                                 .throttleLimit(THROTTLE_LIMIT)
//                                 .build();
    }
    
}
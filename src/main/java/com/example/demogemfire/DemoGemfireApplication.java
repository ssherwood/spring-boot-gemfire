package com.example.demogemfire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.EnableCachingDefinedRegions;

@SpringBootApplication
@EnableCachingDefinedRegions
public class DemoGemfireApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGemfireApplication.class, args);
    }
}

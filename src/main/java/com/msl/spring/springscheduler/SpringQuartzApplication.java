package com.msl.spring.springscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

/**
 * Application bootstrap class.
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Slf4j
@SpringBootApplication
@EnableScheduling
public class SpringQuartzApplication {
	
    protected SpringQuartzApplication() {
        LOGGER.info("Starting SpringQuartzApplication");
    }

    public static void main(String[] args) {
    	SpringApplication.run(SpringQuartzApplication.class, args);
    }

}

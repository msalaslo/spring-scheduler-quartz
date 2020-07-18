package com.msl.spring.springscheduler.scheduler;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.msl.spring.springscheduler.service.SampleJobService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SampleJob implements Job {


    @Autowired
    private SampleJobService jobService;

    public void execute(JobExecutionContext context) throws JobExecutionException {

        LOGGER.info("Job ** {} ** fired @ {}", context.getJobDetail().getKey().getName(), context.getFireTime());

        jobService.executeSampleJob();

        LOGGER.info("Next job scheduled @ {}", context.getNextFireTime());
    }
}
package com.msl.spring.springscheduler.service.impl;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.msl.spring.springscheduler.service.SampleJobService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SampleJobServiceImpl implements SampleJobService{

	public static final long EXECUTION_TIME = 5000L;

	private AtomicInteger count = new AtomicInteger();

	public void executeSampleJob() {

		LOGGER.warn("The sample job has begun...");
		try {
			Thread.sleep(EXECUTION_TIME);
		} catch (InterruptedException e) {
			LOGGER.error("Error while executing sample job", e);
		} finally {
			count.incrementAndGet();
			LOGGER.info("Sample job has finished...");
		}
	}

	public int getNumberOfInvocations() {
		return count.get();
	}
}

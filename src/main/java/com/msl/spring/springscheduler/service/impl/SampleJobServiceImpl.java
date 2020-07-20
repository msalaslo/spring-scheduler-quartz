package com.msl.spring.springscheduler.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.msl.spring.springscheduler.service.SampleJobService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SampleJobServiceImpl implements SampleJobService{

	public static final long EXECUTION_TIME = 1000;

	private AtomicInteger count = new AtomicInteger();

	public void executeSampleJob() {

		LOGGER.warn("The sample job has begun... count:" + count + " in host:" + getHostAndIp() );
		try {
			Thread.sleep(EXECUTION_TIME);
		} catch (InterruptedException e) {
			LOGGER.error("Error while executing sample job", e);
		} finally {
			count.incrementAndGet();
			LOGGER.warn("Sample job has finished...");
		}
	}

	public int getNumberOfInvocations() {
		return count.get();
	}
	
    private static String getHostAndIp() {
    	 
        InetAddress ip = null;
        String hostname = "";        
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName(); 
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostname + "/" + ip;
    }
}

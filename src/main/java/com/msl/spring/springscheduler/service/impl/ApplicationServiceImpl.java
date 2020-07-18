package com.msl.spring.springscheduler.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msl.spring.springscheduler.domain.entity.ApplicationItem;
import com.msl.spring.springscheduler.domain.repository.ApplicationRepository;
import com.msl.spring.springscheduler.service.ApplicationService;

/**
 * Sample service implementation.
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public void createApplicationItem(ApplicationItem applicationItem) {
        applicationRepository.save(applicationItem);
    }

    @Override
    public List<ApplicationItem> getApplicationItems() {
      return applicationRepository.findAll();
    }

}

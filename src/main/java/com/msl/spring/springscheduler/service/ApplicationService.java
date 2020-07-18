package com.msl.spring.springscheduler.service;


import java.util.List;

import com.msl.spring.springscheduler.domain.entity.ApplicationItem;

/**
 * Sample service interface used as template. <b>Please remove for actual project implementation.</b>
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
public interface ApplicationService {

	/**
	 * Creates an application item.
	 * 
	 * @param applicationItem The application item to create.
	 */
    void createApplicationItem(ApplicationItem applicationItem);

	/**
	 * Gets all the application items.
	 * 
	 * @return The list of application items.
	 */
    List<ApplicationItem> getApplicationItems();

}

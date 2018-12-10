/**
 * author: simu dec 2018
 * @Component is a generic stereotype for any Spring-managed component
 * @Service annotates classes at the service layer
 * @Repository annotates classes at the persistence layer, which will act as a database repository
 * 
 *  
 */
package com.simu.example.springboottutorialbasics.aop.business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simu.example.springboottutorialbasics.aop.data.daoTwo;

@Service
public class businessTwo {
	
	@Autowired
	private daoTwo daotwo;
	
	public String servicedaoTwo() {
		
		return daotwo.retrieveDaoTwo();
	}

}

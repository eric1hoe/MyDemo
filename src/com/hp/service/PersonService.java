package com.hp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hp.dao.SpringJDBCTest;
import com.hp.model.Kid;
@Transactional
@Service
public class PersonService {
	@Autowired
	private SpringJDBCTest springJDBCTest;
	
	public void insertKid(){	
		Kid kid=new Kid("瞿浩", 12, "北京");
		springJDBCTest.insertP(kid);
		Kid kid2=new Kid("张飞", 24, "北京");
		springJDBCTest.insertP(kid2);
		try {
			Kid kids=null;
			kids.getAge();	
		} catch (Exception e) {
			
		}
	}
}

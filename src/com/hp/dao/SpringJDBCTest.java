package com.hp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import com.hp.model.Kid;
@Component
public class SpringJDBCTest extends JdbcDaoSupport {
	
	@Autowired
	public SpringJDBCTest(JdbcTemplate jdbcTemplate) {
		this.setJdbcTemplate(jdbcTemplate);
	}
	public  void insertP(Kid kid){
		getJdbcTemplate().update("insert into myuser(name,age) values(?,?)",kid.getName(),kid.getAge());
	}
	
	
	
	
}

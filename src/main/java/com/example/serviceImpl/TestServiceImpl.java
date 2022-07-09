package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAOImpl.TestDAOImpl;
import com.example.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDAOImpl testDAOImpl;
	
	@Override
	public void test() {
		testDAOImpl.testMongo();
	}

}

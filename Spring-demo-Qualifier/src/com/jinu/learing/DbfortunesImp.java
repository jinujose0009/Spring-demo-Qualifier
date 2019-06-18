package com.jinu.learing;

import org.springframework.stereotype.Component;

@Component
public class DbfortunesImp implements FortunesService {

	@Override
	public String getFortunes() {
		// TODO Auto-generated method stub
		return "DB Fortunes";
	}

}

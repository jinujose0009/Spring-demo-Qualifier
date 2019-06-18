package com.jinu.learing;

import org.springframework.stereotype.Component;

@Component
public class HappyFortunesImp implements FortunesService {

	@Override
	public String getFortunes() {
		// TODO Auto-generated method stub
		return "Happy fortuenes";
	}

}

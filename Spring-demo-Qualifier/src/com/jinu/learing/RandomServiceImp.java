package com.jinu.learing;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomServiceImp implements FortunesService {
	
	String Data[]={"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of goog luck",
			"The journey is the reward"};
	private Random myRandom= new Random();

	@Override
	public String getFortunes() {
		int intex=myRandom.nextInt(Data.length);
		
		return Data[intex];
	}

}

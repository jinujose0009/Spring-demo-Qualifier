package com.jinu.learing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
 
	@Autowired
	@Qualifier("restFortunesImp")
	private FortunesService fortuneservice;
	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortunes();
	}

	@Override
	public String getDailyfortunes() {
		// TODO Auto-generated method stub
		return "Daily spend for 30 min for run";
	}

}

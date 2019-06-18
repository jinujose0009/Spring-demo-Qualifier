package com.jinu.learing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
 
	/*@Autowired
	@Qualifier("randomServiceImp")*/
	private FortunesService fortuneservice;
	@Value("${sports.email}")
	private String email;
	@Value("${sports.location}")
	private String location;
	
    public String getEmail() {
		return email;
	}
	public String getLocation() {
		return location;
	}
	@Autowired
	public TrackCoach(@Qualifier("randomServiceImp")FortunesService fortuneservice) {
		
		this.fortuneservice = fortuneservice;
	}
	public TrackCoach() {
		System.out.println("Default constructor");
	}
	
	


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

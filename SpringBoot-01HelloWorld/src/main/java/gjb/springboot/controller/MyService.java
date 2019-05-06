package gjb.springboot.controller;

import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	
	@Autowired
	public MyService(){
		
	}
	
	
	@Value("${test.remote-address}")
	private String addr;

	
	public String openConnection(){
		return addr;
		
	}
	
}

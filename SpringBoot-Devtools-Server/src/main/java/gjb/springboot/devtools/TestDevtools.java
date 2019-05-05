package gjb.springboot.devtools;


import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDevtools {

	@GetMapping("/index2")
	public String index2(){
		return LocalDateTime.now().toString();
	}


}

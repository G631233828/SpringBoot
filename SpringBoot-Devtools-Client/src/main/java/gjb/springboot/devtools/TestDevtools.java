package gjb.springboot.devtools;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDevtools {

	@GetMapping("/index1")
	public String index1(){
		return LocalDateTime.now().toString();
	}


}

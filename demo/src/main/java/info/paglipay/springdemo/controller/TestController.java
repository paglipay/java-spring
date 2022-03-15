package info.paglipay.springdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/deputy")
public class TestController {
	@GetMapping("/test")
	public String test() {
		return "test works change here change again here!!";
	}
	
}
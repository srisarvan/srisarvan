package Sg.Sa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CTrler {

	@RequestMapping("/")
	public String ind() {
		System.out.println("in ind,,,,,");
		return "Hello World !!!";
	}
	
}

package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@PostMapping(value = "/create")
	public String create(String userId, String password, String name, String email) {
		System.out.println("userId " + userId + "\npassword " + password + "\nname " + name + "\nemail " + email);
		return "result";
	}
}
package com.example.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000",exposedHeaders = "Access-Control-Allow-Origin")
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired(required = true)
	private LoginRepository loginRepo;
	
	@PostMapping("/post")
	public Login getLogin(@RequestBody Login login) {
		Login l = loginRepo.save(login);
		return l;
	}
	
	@GetMapping("/access")
	public List<Login> getDatas(){
		return loginRepo.findAll();
	}
//	

}

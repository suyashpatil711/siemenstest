package com.siemens.siemens.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siemens.siemens.Pojo.Input;
import com.siemens.siemens.Pojo.Output;
import com.siemens.siemens.Service.UserService;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService us;
	
	@PostMapping("/userdata")
	public Output userdata(@RequestBody Input i) {
		
		return us.calculations(i);
	
	}
}

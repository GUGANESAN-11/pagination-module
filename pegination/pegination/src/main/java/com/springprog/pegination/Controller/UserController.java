package com.springprog.pegination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springprog.pegination.Common.APIResponse;
import com.springprog.pegination.Service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserService userservice; 
	
	@GetMapping("/getUserData")
    public APIResponse getUserDetails(Pageable pageable) {
    	
    	APIResponse apiresponse = userservice.getUserDetails(pageable);
    	return apiresponse;
    }

}

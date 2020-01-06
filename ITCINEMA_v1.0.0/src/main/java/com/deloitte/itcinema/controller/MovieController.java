package com.deloitte.itcinema.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.deloitte.itcinema.model.*;

@Controller
@ResponseBody
public class MovieController {
	@RequestMapping("/")
	public ArrayList<Movie> getAllMovies(){
		return null;
	}
	
	@RequestMapping("/seats")
	public ArrayList<String> getSeats(int movieId){
		return null;
	}
	
	@RequestMapping("/invoice")
	public ArrayList<User> getInvoice() {
		return null;
	}
	
	@PostMapping("/userinfo")
	public void postUserData(@RequestBody ArrayList booking) {
		
	}
	
	@PostMapping("/adminSignup")
	public void postAdminData(@RequestBody Admin admin) {
		
	}
	@RequestMapping("/adminLogin")
	public ArrayList<Admin> getAdminData(){
		return null;
	}
	
	
}

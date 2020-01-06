package com.example.demo.controller;

import com.example.demo.model.*;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.LibraryService;

@Controller
@ResponseBody
public class LibraryController {
	@Autowired
	LibraryService service;
	@RequestMapping("/")
	public ArrayList<Book> getMessage(@RequestParam("name") String name) { 
		return service.getBook();
	}
	
//	@RequestMapping("/user")
//	public String getUser() {
//		return "Displaying User Details";
//	}
	
}

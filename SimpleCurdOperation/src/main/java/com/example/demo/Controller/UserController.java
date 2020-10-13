package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Userrep;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/save")
	public Userrep save(@RequestBody Userrep u) {
		return service.save(u);
	}
	@GetMapping("/getAll")
	public List<Userrep> getAll(){
		return service.getAllusers();
	}
	@GetMapping("/getid/{id}")
	public Optional<Userrep> getUser(@PathVariable String id) {
		return service.getUser(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable String id) {
		service.deleteUser(id);
		
	}
	@PutMapping("/update/{id}")
	public Userrep updateUser(@RequestBody Userrep u,@PathVariable String id) {
		
		
		return service.updateUser(u, id);
	}
	
	
	
}

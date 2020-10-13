package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Userrep;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
public Userrep save(Userrep user) {
	return repo.save(user);
}
public List<Userrep> getAllusers(){
	return (List<Userrep>) repo.findAll();
}
public Optional<Userrep> getUser(String id) {
	return repo.findById(id);
}
public void deleteUser(String id) {
	if(id!=null)
		repo.deleteById(id);
}
public Userrep updateUser(Userrep u,String id) {
	//Optional<User> user=Optional.ofNullable(new User());
	Userrep user=repo.findByuid(id);
	if(user!=null)
		u.setUid(user.getUid());
	return repo.save(u);
}

}

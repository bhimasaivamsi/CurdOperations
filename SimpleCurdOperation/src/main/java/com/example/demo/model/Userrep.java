package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Userrep {
	
	
	
	@Id
	private String uid;
	private String name;
	private String age;
	private String mobile;
	private String adher;

}

package com.example.SocialEase.model; 

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 

@Entity 
public class Exercise { 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	private String name; 
	private String description; 
	public Exercise() {} 
	public Exercise(String name, String description) { 
		this.name = name; 
		this.description = description; 
		}  
	public Long getId() { 
		return id; 
		} 
	public void setId(Long id) { 
		this.id = id; 
		} 
	public String getName() { 
		return name; 
		} 
	public void setName(String name) { 
		this.name = name; 
		} 
	public String getDescription() { 
		return description; 
		} 
	public void setDescription(String description) { 
		this.description = description; 
		}
	}

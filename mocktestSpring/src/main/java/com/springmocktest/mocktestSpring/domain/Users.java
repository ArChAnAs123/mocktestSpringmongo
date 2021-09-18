package com.springmocktest.mocktestSpring.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection  = "users")
public class Users {
	
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", iduser=" + iduser + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", gender=" + gender + ", ip_address=" + ip_address + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return first_name;
	}
	public void setFirstname(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public Integer getIduser() {
		return iduser;
	}
	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}
	@Id
    private String id;
	
	private Integer iduser;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;
	
    public Users(Integer iduser, String first_name, String last_name, String email, String gender, String ip_address) {
		super();
		this.iduser = iduser;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.ip_address = ip_address;
	}
    
    
}

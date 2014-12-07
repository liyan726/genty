package com.genty.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class User implements UserDetails {

	private String name;
	private int id;
	private int age;
	private List<Integer> cards;
	private FilesInfo file;
	private String role;
	private String username;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Integer> getCards() {
		return cards;
	}
	public void setCards(List<Integer> cards) {
		this.cards = cards;
	}
	public FilesInfo getFile() {
		return file;
	}
	public void setFile(FilesInfo file) {
		this.file = file;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Security
	 */
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> lis =new ArrayList<GrantedAuthority>();
	System.out.println("========:"+role);
		GrantedAuthority authority =new SimpleGrantedAuthority(role);
		lis.add(authority);
		return lis;
	}
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}
	
	
}

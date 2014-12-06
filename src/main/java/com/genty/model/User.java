package com.genty.model;

import java.util.List;



public class User {

	private String name;
	private int id;
	private int age;
	private List<Integer> cards;
	private FilesInfo file;
	
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
	
	
}

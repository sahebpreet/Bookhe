package com.bookhe.book.dto;

public class Book {
	String ISBN;
	String name;
	String author;
	String publisher;
	String edition;
	float cost;
	String category;
	public Book(){
		this("1","book","knight","wesley","1.0v",1000,"funt");
		System.out.println("Blank details");
	}
	
	public Book(String iSBN, String name, String author, String publisher,String edition, float cost, String category) {
		ISBN = iSBN;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.edition = edition;
		this.cost = cost;
		this.category = category;
	}
	
	public boolean validateContents(){
		if(this.name.isEmpty() || this.name == null || this.name.equals(" "))
			return false;
		else if(this.author.isEmpty() || this.author == null || this.author.equals(" "))
			return false;
		else if(this.publisher.isEmpty() || this.publisher == null || this.publisher.equals(" "))
			return false;
		else if(this.edition.isEmpty() || this.edition == null || this.edition.equals(" "))
			return false;
		else if(this.category.isEmpty() || this.category == null || this.category.equals(" "))
			return false;
		else if(this.cost<=0)
			return false;
		return true;
	}
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

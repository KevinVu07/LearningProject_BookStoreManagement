package bookStoreEntity;

import java.util.Date;

public class Book {
	private int id;
	private String name;
	private String ISBN;
	private String author;
	private int yearOfPublication;
	private int quantity;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, String iSBN, String author, int yearOfPublication, int quantity) {
		super();
		this.id = id;
		this.name = name;
		ISBN = iSBN;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

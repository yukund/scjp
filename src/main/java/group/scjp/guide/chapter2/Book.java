package group.scjp.guide.chapter2;

public class Book {
	public Long id;
	public int pages;
	public String isbn;

	//can change the example to be positive number
	public Book(){
		this.pages = 100;
	}

	public static void main(String[] args) { 
		Book bookA = new Book();
		System.out.println(bookA.pages + " :) ");

		//bad thing, callers are able to change the state
		bookA.pages = -100;
		System.out.println(bookA.pages + " :( ");
	}

}


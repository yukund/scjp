package group.scjp.guide.chapter2;

public class Book {
	public Long id;
	public int pages;
	public String isbn;

	//pages can be changed to a negative number
	public Book(){
		this.pages = 100;
	}
	
	public void showIndex() {
		System.out.print(this.toString() + ":  print out Book index");
	}

	public static void main(String[] args) { 
		Book bookA = new Book();
		System.out.println(bookA.pages + " :) ");

		//bad thing, callers are able to change the state
		bookA.pages = -100;
		System.out.println(bookA.pages + " :( ");
	}

	public void showBook(Book book) {
		// TODO Auto-generated method stub
		
	}

}


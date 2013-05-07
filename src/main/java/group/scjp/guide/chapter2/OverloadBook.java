package group.scjp.guide.chapter2;

import static group.scjp.guide.util.PrintUtil.print;
import group.scjp.guide.util.PrintUtil;

public class OverloadBook extends Book{
	
	@Override
	public void showBook(Book book) {print("OverloadBook version");}
	
	/**
	 * Overload methods
	 * -must change argument lists
	 * -can change return type
	 * -access modifier
	 * -Declare new or broader checked exceptions
	 * -a method can be overload in subclass 
	 */
	public Integer showIndex(Integer i) throws Exception { return i;}

	public void showPage(){print("original showPage");};
	// a method can be overloaded in the same class
	public void showPage(long pageNumber){print("long version");}
	protected void showPage(float pageNumber){print("float verion");}
	// with non primitive types 
	public void showIndex(GoodBook goodBook) {PrintUtil.print("my input parameter type is GoodBook ");}
	public void showIndex(Book book) {print("my input parameter type is Book");}
	
	public static void main(String[] str){
		OverloadBook overloadBook = new OverloadBook();
		overloadBook.showPage();
		
		overloadBook.showPage(1f);
		overloadBook.showPage(1);

		overloadBook.showIndex(overloadBook);
		overloadBook.showIndex(new Book());
		
		// reference type decided which overload method is invoked
		// polymorphism does not determine which overloaded version of a method to call
		Book book = overloadBook;
		overloadBook.showIndex(book);
		
		// object type decided which override method is invoked
		// polymorphism does determine which overridden version of a method to call
		overloadBook.showBook(book);
		
	}
	
}

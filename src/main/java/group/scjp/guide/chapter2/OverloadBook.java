package group.scjp.guide.chapter2;

import group.scjp.guide.util.PrintUtil;

public class OverloadBook extends Book{
	
	@Override
	public void showIndex() {}
	
	/**
	 * Overload methods must change:
	 * -method signatures: return type  argument lists
	 * -access modifier
	 * -decluare new or broader checked exceptions
	 * -a method can be overloaed in subclass 
	 */
	public Integer showIndex(Integer i) throws Exception { return i;}

	public void showPage(){PrintUtil.Print("original showPage");};
	
	// a method can be overloaed in the same class
	public void showPage(int pageNumber){PrintUtil.Print("overloading showPage with PageNumber: " +pageNumber);}
	
	public static void main(String[] strings){
		OverloadBook overloadBook = new OverloadBook();
		overloadBook.showPage();
		overloadBook.showPage(1);
		
	}
}

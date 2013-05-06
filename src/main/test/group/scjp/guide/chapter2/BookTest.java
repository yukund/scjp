package group.scjp.guide.chapter2;

import org.junit.Test;

import junit.framework.TestCase;

public class BookTest extends TestCase{
	
	@Test
	public void testBookShouldShowIndex() {
		OverloadBook overloadBook = new OverloadBook();
		overloadBook.showPage();
		overloadBook.showPage(1);
	}
}

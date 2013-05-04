package group.study.scjpcoding.test.chapter2;

import static org.junit.Assert.*;
import group.study.scjpcoding.chapter2.GoodBook;

import org.junit.Test;

public class GoodBookTest {

	@Test
	public void test() {
		GoodBook goodBook = new GoodBook();
		goodBook.setNumberOfPages(3);
		assertEquals(3, goodBook.getNumberOfPages());
	}

}

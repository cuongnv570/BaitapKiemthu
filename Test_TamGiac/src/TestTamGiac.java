import static org.junit.Assert.*;

import org.junit.Test;


public class TestTamGiac {

	@Test
	public void testIsTamGiac() {
		TamGiac tg1 = new TamGiac(1,1,1);
		assertEquals(true,tg1.IsTamGiac());
	}
	
	@Test
	public void testTypeTamGiac() {
		TamGiac tg2 = new TamGiac(3,3,3);
		assertEquals("Equilateral",tg2.TypeTamGiac());
	}
	
	@Test
	public void testTypeTamGiac1() {
		TamGiac tg3 = new TamGiac(3,3,2);
		assertEquals("Isosceles",tg3.TypeTamGiac());
	}
	
	@Test
	public void testTypeTamGiac2() {
		TamGiac tg4 = new TamGiac(2,3,4);
		assertEquals("Scalene",tg4.TypeTamGiac());
	}
	
	@Test
	public void testTypeTamGiac3() {
		TamGiac tg5 = new TamGiac(2,3,7);
		assertEquals("NotATriangle",tg5.TypeTamGiac());
	}
}

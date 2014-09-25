import static org.junit.Assert.*;

import org.junit.Test;


public class TestDate {

	@Test
	public void testNextDate() {
		Date d = new Date();
		assertEquals("2/4/2011",d.nextDate(1,4,2011));
	}
	
	@Test
	public void testNextDate1() {
		Date d = new Date();
		assertEquals("1/5/2011",d.nextDate(30,4,2011));
	}
	
	@Test
	public void testNextDate2() {
		Date d = new Date();
		assertEquals("2/1/2011",d.nextDate(1,1,2011));
	}
	
	@Test
	public void testNextDate3() {
		Date d = new Date();
		assertEquals("1/2/2011",d.nextDate(31,1,2011));
	}
	
	@Test
	public void testNextDate4() {
		Date d = new Date();
		assertEquals("1/1/2012",d.nextDate(31,12,2011));
	}
	
	@Test
	public void testNextDate5() {
		Date d = new Date();
		assertEquals("1/3/2012",d.nextDate(29,2,2012));
	}
	
	@Test
	public void testNextDate6() {
		Date d = new Date();
		assertEquals("NotDate",d.nextDate(29,2,2011));
	}
}

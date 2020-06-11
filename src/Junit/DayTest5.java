/**
 *
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Tomoyuki
 *
 */
public class DayTest5 {

	@Test
	public void test1() {
		//正常系のテスト1

		Day5 day = new Day5(1983, 4, 15);
		assertEquals(day.formatDay(),"1983年4月15日");

	}

	@Test
	public void test2() {
		//異常系のテスト1

		Day5 day = new Day5(1983, 4, 31);
		assertEquals(day.formatDay(),"1983年4月30日");

	}

	@Test
	public void test3() {
		//異常系のテスト2

		Day5 day = new Day5(2001, 19, 4);
		assertEquals(day.formatDay(),"2001年1月4日");

	}


	@Test
	public void test4() {
		//正常系のテスト2

		Day5 day = new Day5(2020, 2, 29);
		assertEquals(day.formatDay(),"2020年2月29日");

	}

	@Test
	public void test5() {
		//異常系のテスト3

		Day5 day = new Day5(2019, 2, 29);
		assertEquals(day.formatDay(),"2019年2月28日");

	}


}

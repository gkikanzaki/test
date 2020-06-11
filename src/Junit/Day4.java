package Junit;
public class Day4 {

	private int year;
	private int month;
	private int date;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String formatDay() {
		return year + "年" + month + "月" + date + "日";
	}

	public Day4(int year, int month, int date) {
	    setYear(year);
	    setMonth(month);
	    setDate(date);
	}

	public Day4(int year, int month) {
		this(year, month, 1);
	}
}

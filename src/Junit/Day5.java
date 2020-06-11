package Junit;
class Day5 {

	  private int year;
	  private int month;
	  private int date;

	  public int getYear() {
	    return year;
	  }

	  public void setYear(int year) {
		if(year > 1){
			this.year = year;
		}else{
			this.year = 1980;
		}
	  }

	  public int getMonth() {
	    return month;
	  }

	  public void setMonth(int month) {
		if(month < 1) {
			this.month = 1;
		}else if(month > 12){
			this.month = 12;
		}else{
			this.month = month;
		}
	  }

	  public int getDate() {
	    return date;
	  }

	  public void setDate(int date) {
		int maxDate = 31;		//月毎に異なる日の最大値を格納するためのローカル変数

		switch(month){		//月毎の日の最大値を設定

		case 4:
		case 6:
		case 9:
		case 11:
			maxDate = 30;
			break;

		case 2:
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){	//うるう年なら
				maxDate = 29;
			}else{
				maxDate = 28;
			}

		}

		if(date < 1) {
			this.date = 1;
		}else if(date > maxDate){
			this.date = maxDate;
		}else{
			this.date = date;
		}

	  }

	  public String formatDay() {
	    return year + "年" + month + "月" + date + "日";
	  }

	  public Day5(int year, int month, int date) {
		  this.year = year;
		  this.month = month;
		  this.date = date;
	  }

	  public Day5(int year, int month) {
	    this(year, month, 1);
	  }

	  public Day5() {
	    this(1980, 1, 1);
	  }
}
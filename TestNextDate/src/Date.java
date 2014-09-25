
public class Date {
	
	
	public String nextDate(int day, int month, int year){
		
		int nextday = day;
		int nextmonth = month;
		int nextyear = year;
		
		String nextdate;
		
		if(month == 4 || month == 6 || month == 9|| month == 11){
			if(day < 30){
				nextday = day + 1;
			}
			else if( day == 30){
				nextday = 1;
				nextmonth = month + 1;
			}
			else{
				return "NotDate";
			}
		}
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10){
				if(day < 31){
					nextday = day + 1;
				}
				else if(day == 31){
					nextday = 1;
					nextmonth = month + 1;
				}
				else{
					return "NotDate";
				}
		}
		
		if(month == 12){
				if(day < 31){
					nextday = day + 1;
				}
				else if(day == 31){
					nextday = 1;
					nextmonth = 1;
					nextyear = year +1; 
				}
				else{
					return "NotDate";
				}
		}
		
		if(month==2){
			if((year%4 == 0)&&(year%100 != 0)){
				if(day < 29){
					nextday = day + 1;
				}
				else if(day == 29){
					nextday = 1;
					nextmonth = month + 1;
				}
				else{
					return "NotDate";
				}
			}
			else{
				if(day < 28){
					nextday = day + 1;
				}
				else if(day == 28){
					nextday = 1;
					nextmonth = month + 1;
				}
				else{
					return "NotDate";
				}
			}
		}
		return	nextdate = nextday + "/" + nextmonth +"/" + nextyear;
	}
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.print(d1.nextDate(30,4,2011));
	}
}

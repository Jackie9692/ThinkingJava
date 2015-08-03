package day03;

public enum WeekDay {
//	NOT, MILD, MEDIUM, HOT, FLAMING
	Mon("Money"), Tue("Tuesday");
	private final String day;
	
	private WeekDay(String day){
		this.day = day;
	}
	
	public static void printDay(int i){
		switch(i){
		case 1: System.out.println(WeekDay.Mon); break;
		case 2: System.out.println(WeekDay.Tue); break;
		
		default: System.out.println("Wrong number!");
		}
		
//		WeekDay.values();
	}
	
	public String getDay(){
		return this.day;
	}
	
	@Override
	public String toString(){
		return this.day;
	}
	
	
}

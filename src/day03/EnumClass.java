package day03;

import org.junit.Test;

public class EnumClass {

	@Test
	public void testEnum(){
		WeekDay day = WeekDay.Tue;
		
//		day.name()
		
		System.out.println(day);
		System.out.println(day.toString());
		System.out.println(day.name());
		System.out.println(day.ordinal());
		
		Object obj = new Object();
		obj.equals(obj);
		
	}
	
	
}

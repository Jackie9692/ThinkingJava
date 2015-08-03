package day01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test default value
/*		DefaultValue test = new DefaultValue();
		System.out.println(test.boolType);
		System.out.println(test.charType);
		System.out.println(test.floatType);
		System.out.println(test.byteType);
		System.out.println(test.stringType);*/
		
		StatiClass s1 = new StatiClass();
		StatiClass s2 = new StatiClass();
		
		System.out.println(s1.i);
		System.out.println(s2.i);
		
		s1.i ++;
		System.out.println(s1.i);
		System.out.println(s2.i);
		
		StatiClass.i ++;
		System.out.println(s1.i);
		System.out.println(s2.i);
	
		s1.increament();
		System.out.println(s1.i);
		System.out.println(s2.i);
		System.out.println("jackie9692 modified");
	}

}

class StatiClass{
	static int i = 88;
	
	static void increament(){
		StatiClass.i ++;
	}
}

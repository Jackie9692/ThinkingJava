package day02;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class OperatorTest {
	
	@Test
	public void testPlusPlus(){
		int i = 0;
		for(; i < 10; i++){
			System.out.print(i);
		}
		System.out.println("");
		
		int j = 0;
		for(; j < 10; ++j){
			System.out.print(j);
		}
	}
	
	@Test
	public void testBitOperate(){
		int i = 5;
		int aa = i<<2;
		System.out.println(aa);
		System.out.println(i);
		
		aa = 1 < 2 ? 1+2:100*10;
		System.out.println(aa);
		
	}
	@Test
	public void testSwitch(){
		char cRank = 'D';
		switch(cRank){
		case 'A': System.out.println("成绩优秀"); break;
		case 'B': System.out.println("成绩良好"); break;
		case 'C': System.out.println("成绩中等"); break;
		case 'D': System.out.println("成绩及格"); break;
		default: System.out.println("不及格");
		}
		
			
	}
	
	@Test
	public void testFib(){
		tFib(1);
		tFib(2);
		tFib(3);
		tFib(4);
		tFib(5);
		
		tFib(15);
	}
	public void tFib(int terms){
		int first = 1;
		int second = 1;
		int third = first + second;
		System.out.print("terms" + terms + ": ");
		if(terms < 1) return ;
		if(terms < 2) 
			System.out.print(first + "" );
		else
		  System.out.print(first + ", " + second);
		
		for(int i = 3; i <=terms; ++i){
			third = first + second;
			System.out.print(", " + third);
			
			first = second;
			second = third;
			
		}
		System.out.println("");
	}

	@Test
	public void testArray(){
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3, 4, 5};
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		
		arr1[0] = 100;
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		
		System.out.println(Arrays.toString(arr3));
		
		Random random = new Random(47);
//		random.
		
		
		int[] arr4;
//		arr4[1] = 10;
		
		printArr();
		
		printArr(1,2,4,5);
	}
	
	public void printArr1(double... arr){
		for(double i : arr){
			System.out.print(i + " ");
		}
		System.out.println("two");
		
	}
	
	public void printArr(int... arr){
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println("one");
		
	}
	

	

}














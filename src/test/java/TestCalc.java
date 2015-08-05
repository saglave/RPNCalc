package test.java;

import junit.framework.TestCase;
import main.java.Calc;

public class TestCalc extends TestCase{
	public void test1(){
		String input = "3 2 +";
		assertEquals("5.0", String.valueOf(Calc.method(input)));
	}
	public void test2(){
		String input = "100 %";
		assertEquals("1.0", String.valueOf(Calc.method(input)));
	}
	public void test3(){
		String input = "9 3 *";
		assertEquals("27.0", String.valueOf(Calc.method(input)));
	}
	public void test4(){
		String input = "9 *";
		assertEquals("Invalid Input", String.valueOf(Calc.method(input)));
	}
	public void test5(){
		String input = "2 3 ^";
		assertEquals("8.0", String.valueOf(Calc.method(input)));
	}
	public void test6(){
		String input = "3 3 3 +";
		assertEquals("Invalid Input", String.valueOf(Calc.method(input)));
	}
	public void test7(){
		String input = "9 3 2 - *";
		assertEquals("9.0", String.valueOf(Calc.method(input)));
	}
	public void test8(){
		String input = "12 3 / !";
		assertEquals("24.0", String.valueOf(Calc.method(input)));
	}
}

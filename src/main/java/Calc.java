package main.java;
import java.util.*;

public class Calc {
	public static String method(String input) {
		final Stack<Float> st = new Stack<Float>();
		String[] split = input.split(" ");
		String output = "";
		float operand = 0;
		for(String token:split){
			try  
			  {  
				operand = Float.parseFloat(token);
				st.push(operand);
			  }  
			  catch(NumberFormatException nfe)  
			  {  
				  
				  
					  switch(token){
					  
					  case "+": output = addition(st);
					  			break;
					  case "-": output = subtraction(st);
					  			break;
					  case "*": output = multiplication(st);
					  			break;
					  case "/": output = division(st);
					  			break;
					  case "^": output = power(st);
								break;
					  case "!":	output = factorial(st);
					  			break;
					  case "%": output = mod(st);
					  			break;
					  default:  System.out.println("Invalid Input");
					  			return "Invalid Input";
				  }
			  }
		}
		if(output.equals("Invalid Input"))
			return output;
		float answer= st.pop();
		String returnCalc = String.valueOf(answer);
		if(st.empty()){
			System.out.println(answer);
			return returnCalc;
		}
		System.out.println("Invalid Input");
		return "Invalid Input";
		
	}	
	
	public static String addition(Stack<Float> st){
		float operand2, operand1;
		try{
			  operand2 = st.pop();
			  operand1 = st.pop();
			}
			catch(EmptyStackException ese)
			{
				  System.out.println("Invalid Input");
				  return "Invalid Input";
			}
	  		float result = operand1+operand2;
			st.push(result);
			return "";
	}
	public static String subtraction(Stack<Float> st){
		float operand2, operand1;
		try{
			  operand2 = st.pop();
			  operand1 = st.pop();
			}
			catch(EmptyStackException ese)
			{
				  System.out.println("Invalid Input");
				  return "Invalid Input";
			}
	  		float result = operand1-operand2;
			st.push(result);
			return "";
	}
	public static String multiplication(Stack<Float> st){
		float operand2, operand1;
		try{
			  operand2 = st.pop();
			  operand1 = st.pop();
			}
			catch(EmptyStackException ese)
			{
				  System.out.println("Invalid Input");
				  return "Invalid Input";
			}
	  		float result = operand1*operand2;
			st.push(result);
			return "";
	}
	public static String division(Stack<Float> st){
		float operand2, operand1;
		try{
			  operand2 = st.pop();
			  operand1 = st.pop();
			}
			catch(EmptyStackException ese)
			{
				  System.out.println("Invalid Input");
				  return "Invalid Input";
			}
	  		float result = operand1/operand2;
			st.push(result);
			return "";
	}
	public static String power(Stack<Float> st){
		float operand2, operand1;
		try{
			  operand2 = st.pop();
			  operand1 = st.pop();
			}
			catch(EmptyStackException ese)
			{
				  System.out.println("Invalid Input");
				  return "Invalid Input";
			}
			float result = (float) Math.pow(operand1,operand2);
			st.push(result);
			return "";
	}
	public static String factorial(Stack<Float> st){
		float operand1;
		try{
			  operand1 = st.pop();
			}
			catch(EmptyStackException ese)
			{
				  System.out.println("Invalid Input");
				  return "Invalid Input";
			}
			float result = 1.0f;
			for(int i = 1; i <= operand1; i++)
  				result*= i;
			st.push(result);
			return "";
	}
	public static String mod(Stack<Float> st){
		float operand1;
		try{
			  operand1 = st.pop();
			}
			catch(EmptyStackException ese)
			{
				  System.out.println("Invalid Input");
				  return "Invalid Input";
			}
			float result;
			result = operand1/100;
			st.push(result);
			return "";
	}
}	
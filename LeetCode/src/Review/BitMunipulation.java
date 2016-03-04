package Review;

import java.util.Stack;

public class BitMunipulation {

	public static void main(String[] args) {
		String str = "18";
		System.out.println();
	}
	
	  public int evalRPN(String[] tokens) {
	        Stack<Integer> stack = new Stack<Integer>();
	        for (int i = 0; i < tokens; i++) {
	            String s = tokens[i];
	            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                    int b = stack.pop();
                    int a = stack.pop();
	               switch(tokens[i]) {

	                    case "+":
	                        stack.push(a + b);
	                        break;
	                    case "-":
	                        stack.push(a - b);
	                        break;
	                    case "*":
	                        stack.push(a * b);
	                        break;
	                    default:
	                        stack.push(a / b);
	                }
	            } else {
	                stack.push(Integer.parseInt(tokens[i]));
	            }
	        }
	        return stack.peek();
	    }
}

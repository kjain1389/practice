import java.util.Stack;

public class BracketProblem {
	 public static void main(String args[]) {

	        //System.out.println(balancedParenthensies("{(a,b)}"));
	       // System.out.println(balancedParenthensies("{(a},b)"));
	       // System.out.println(balancedParenthensies("{)(a,b}"));
	        System.out.println(balancedParenthensies("[{()}{}]"));
	    }

	    public static boolean balancedParenthensies(String s) {
	        Stack<Character> stack  = new Stack<Character>();
	        for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if(c == '[' || c == '(' || c == '{' ) {     
	                stack.push(c);
	            } else if(c == ']') {
	                if(stack.isEmpty() || stack.pop() != '[') {
	                    return false;
	                }
	            } else if(c == ')') {
	                if(stack.isEmpty() || stack.pop() != '(') {
	                    return false;
	                }           
	            } else if(c == '}') {
	                if(stack.isEmpty() || stack.pop() != '{') {
	                    return false;
	                }
	            }
	            System.out.println(stack);
	        }
	        
	        return stack.isEmpty();
	    }
}

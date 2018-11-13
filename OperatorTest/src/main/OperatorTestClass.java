package main;

 public class OperatorTestClass {
 	
	 public int addition(int operand1, int operand2) {
		
		 return operand1 + operand2;
	
	 }
 	
 	public int subtraction(int operand1, int operand2) {
		
 		return operand1 - operand2;
	
 	}
 	
 	public double division(int operand1, int operand2) {
	
 		return (double)operand1 / (double)operand2;
	
 	}
 	
 	public int multiplication(int operand1, int operand2) {
	
 		return operand1 * operand2;
	
 	}
 	
 	public int modulus(int operand1, int operand2) {
	
 		return operand1 % operand2;
	
 	}
 	
 	public Object bitNot(int operand1) {
	      
		return ~operand1;
	}
 	
 	public Object bitAnd(int operand1, int operand2) {
	
		return operand1 & operand2;
	}
 	
 	public Object bitOr(int operand1, int operand2) {
		
 		return operand1|operand2;
	
 	}
 	
 	public Object bitExOr(int operand1, int operand2) {
		
		return operand1^operand2;
	
 	}
 	
 	public Object bitShiftRight(int operand1) {
		
		return operand1>>1;
	
 	}
 	
 	public Object bitShiftRightZero(int operand1) {
		
 		return operand1 >>> 1;
 		
	}
 	
 	public Object bitShiftLeft(int operand1) {
 		
 		return operand1 << 1;
 		
	}
 	
 	public Object bitShiftLeftZero(int operand1) {
		
 		return operand1 << 0;
	
 	}
 	
 	public Object equalTo(int i, int j) {
		
 		return i==j;
	
 	}
 	
 	public Object notEqualTo(int operand1, int operand2) {
 		
 		return operand1 != operand2;
			
	}
 	
 	public Object greaterThan(int operand1, int operand2) {
 	
 		return operand1 > operand2;
	
 	}
 	
 	public Object greaterThanOrEqual(int operand1, int operand2) {
 		
 		return operand1 >= operand2;
			
	}
 	
 	public Object lessThan(int operand1, int operand2) {
 		
 		return operand1 < operand2;
	
	}
 	
 	public Object lessThanOrEqual(int operand1, int operand2) {
 		
 		return operand1 <= operand2;
		
	}
 	
 	public Object logicalNot(boolean operand1) {
 		
 		return !operand1;
	
 	}
 	
 	public Object logicalAnd(boolean operand1, boolean operand2) {
 		
 		return operand1 && operand2;
 		
	}
 	
 	public Object logicalOr(boolean operand1, boolean operand2) {
 		
 		return operand1||operand2;
 		
	}
 	
 	public Object logicalExOr(boolean operand1, boolean operand2) {
 		
			return operand1^operand2;
		
	}
 	
 	public Object shortCircuitAnd(boolean operand1, boolean operand2) {
		
 		return operand1 & operand2;
 		
	}
 	
 	public Object shortCircuitOr(boolean operand1, boolean operand2) {
		
 	     return operand1 || operand2;	
	
 	}
}
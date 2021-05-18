package chapter5;

public class MethodTest2 {
	int add(int a, int b) {
	return a + b;
	}
	
	int substract(int a, int b) {
		return a - b;
	}
	
	long multiply(int a, int b) {
		return ((long) a * b);
	}
	
	double divide(int a, int b) {
		return (int)((double) a / b*10 + 0.5)/ 10.0;
	}	
}

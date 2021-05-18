package chapter10;

public class NumberFormatExceptionExample {

	   public static void main(String[] args) {
		      try {
		      
		      String data1 = "100"; //문자열 숫자를 숫자로 바꿀 수 있음
		      String data2 = "a200";
		      
		      
		      int value1 = Integer.parseInt(data1);
		      int value2 = Integer.parseInt(data2);
		      
		      int result = value1 + value2;
		      System.out.println(result);
		   } catch (NumberFormatException e) {
		      System.out.println(e.getMessage());
		   }

		}
	}

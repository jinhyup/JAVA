package chapter10;

public class Exception {
	public static void main(String[] args) throws ClassNotFoundException {

		// 클래스를 던진다.
		Class.forName("java.lang.String");

	}
}
//	트라이캐치사용   
//	2. public static void main(String[] args) {
//	   try {
//	      Class.forName("java.lang.String");
//	   } catch (ClassNotFoundException e) {
//	      e.printStackTrace();
//	   }
//	}
//	}

package chapter5;

public class SickDay {
	
	/*
	 * 생성자는 클래쓰와 이름이 똑같고,
	 * 생성자는 대문자로 시작한다.
	 * 근데 생성자는 무엇일까 인스턴스 초기화 메소드
	 * 리턴값이 없음 
	 */
	
	public SickDay() {
		// TODO Auto-generated constructor stub
	}
	
   public static void main(String[] args) {
//      7.
      System.out.println(MyAdd.add(1000));
//      8.
      MyAdd myadd = new MyAdd();
      System.out.println(myadd.add(1000, 1000));
//      9.
      System.out.println(myadd.add(1000, 25800l));
//      10.
      System.out.println(myadd.add('a', 100f));
      
   }

}
class MyAdd{
//   1.
   static int a = 20;
//   2.
   int b = 15;
//   3.
   static int add(int sum) {
      sum += a;
      return sum;
   }
//   4.
   int add(int a1, int a2) {
      return a1 + a2;
   }
//   5.
   long add(int a1, long a2) {
      return a1 + a2;
   }
//   6.
   float add(char a1, float a2) {
      return a1 + a2;
   }

}

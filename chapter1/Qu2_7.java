package chapter1;

public class Qu2_7 {

	public static void main(String[] args) {
	boolean	power = false;
	System.out.println(power);
	
	power = !power;
	System.out.println(power);
	//
	System.out.println("---------------------");
	
	byte b1 = 80;
	byte b2 = 100;
	long lo1 = 642;
	
	short result1 =(short)(lo1 +b1);
	System.out.println(result1);
	
	int result2 = b1 + b2;
	System.out.println(result2);
	
	byte result3 = (byte)(b1 + b2);
	System.out.println(result3);

	long lo2 = 60000L*80000L;
	System.out.println(lo2);
	}

}

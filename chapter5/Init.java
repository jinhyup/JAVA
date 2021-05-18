package chapter5;

public class Init {
	static int action;
	static {
		action = 1;
		System.out.println(action);
	}	
	
	int action2 = 2;
	{
		System.out.println(action2);
		action2 = 3;
		System.out.println(action2);
	}
	
	Init(){
		action2 = 4;
		System.out.println(action2);
	}
	
	Init(int action2) {
		this();
		this.action2 = action2;
		System.out.println(action2);
	}	
}




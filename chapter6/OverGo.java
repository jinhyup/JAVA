package chapter6;

public class OverGo extends OverUp {		//자식클래스

	int z = 3;

							// 오버라이딩	:	부모클래스로부터 상속받은 메소드내용을 변경하는 것을 말함
	@Override				//컴파일링할 때 오류가 나는지 확인해주기 위해서 @Override를 씀
	String upMethod() {		//@Override를 안 써도 되지만 써줘야 개발자가 메소드를 구분하기 좋음!
		return super.upMethod();
	}

	String downMethod() {
		return "Basic";
	}

	String downMethod(int k) {
		return x + y + z + k + " : 오버로딩";
	}

}



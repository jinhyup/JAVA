package chapter6;


/* 3-5 상속
 * 상속받고자 하는 클래스의 이름을 'extends' 를 함께 써주면 된다.
 * 상속받는 클래스는 '자손(자식)클래스', 상속하는 클래스는 '조상(부모)클래스'라고 함
 */

public class Extend1 {			//출력문
	public static void main(String[] args) {
		//자식
		Child ci = new Child();
		ci.volume = 15;
		ci.volumeUp();
		System.out.println(ci.volume);
		//부모
		ci.channel = 3;
		ci.channelUp();
		System.out.println(ci.channel);
		
	}
}

	class Child extends Parents{		//부모클래스에서 상속받는 자손클래스
		int volume;						//부모클래스의 채널업메소드를 가져올 수 있음
		void volumeUp() {
			volume++;
		}
	}

	class Parents {
		int channel;			//부모가 가지고 있는 필드
		void channelUp() {		//부모가 가지고 있는 메소드
			channel++;
		}
	}

package chapter6;

public class TimeVOoutput {
/*
 * 클래스 내부에 생성된 데이터를 보호하기 위해 외부의 접근을 제한함.
 * 이를 '데이터 감추기'(data hiding) 또는 '캡슐화'(encapsulation)이라고 함.
 * private으로 지정해 캡슐화한다.
 * 자바에서 필드 선언할 때는 private을 사용하는게 공식 룰.
 */
	public static void main(String[] args) {
		TimeVO tv = new TimeVO();
		tv.setHour(46);
		tv.setMinute(112);
		tv.setSecond(4853);
		System.out.println("현재시간 : " + tv.getHour() + "시" + tv.getMinute() + "분" + tv.getSecond() + "초");
	}
}
//4800 = 3600 + 1200 +53 = 1시간 20분 53초
//112 = 60 + 52 = 1시간 52분
//46 = 24 + 22
//
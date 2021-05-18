package chapter11;

import java.util.HashMap;
import java.util.Map;

public class Ex65 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();	//int라고 쓸 수 없음 객체인 Integer라고 써야함.
		map.put("김자바", new Integer(90));
		map.put("한자바", new Integer(100));
		map.put("이자바", new Integer(80));
		map.put("강자바", new Integer(90));
		map.put("안자바", new Integer(100));
		System.out.println(map);
		
		System.out.println(map.get("김자바"));
//		map.remove("김자바");
//		System.out.println(map);
		map.put("김자바", new Integer(50));
		System.out.println(map);
		
	}

}

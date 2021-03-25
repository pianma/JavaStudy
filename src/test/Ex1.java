package test;

import chapter11.SimpleType;
import chapter11.TV;

public class Ex1 {

	public static void main(String[] args) {
		SimpleType type = new SimpleType();
		
		type.num1 = 5;
		
		type.func1();
		
		System.out.println("========== ===========");
		
		TV LG_TV = new TV();
		LG_TV.setColor("red");
		
		//객체지향 프로그래밍은 기능을 중심으로 프로그램을 개발하는 방법
		//객체를 사용하는 쪽에서는 객체가 제공하는 기능만을 사용해야한다.
		
		//전원을 켰을때 현재 채널번호를 알려주고 싶을 때는?
		//1.전원을켜고
		LG_TV.power();
		
		//2.채널 번호를 알려준다.
		//getter
		System.out.println("현재 채널 번호는 " +LG_TV.getChannel()+"입니다.");
		
	}

}

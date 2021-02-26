package day4;

import java.util.Scanner;

public class Mome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정보입력");
		System.out.println("이름을 입력하시오.");
		String name = sc.next();
		System.out.println("나이를 입력하시오.");
		int age = sc.nextInt();
		System.out.println("이메일을 입력하시오.");
		String email = sc.next();

		Member m = new Member();
		m.setName(name);
		m.setAge(age);
		m.setEmail(email);

		System.out.println("입력 정보 : \n" 
				+ "이름 [" + m.getName() + "] \n" 
				+ "나이 [" + m.getAge() + "] \n" 
				+ "이메일 ["+ m.getEmail() + "]");

	}

}

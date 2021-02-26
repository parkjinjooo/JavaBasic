package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하시오.");
		String id = sc.next();
		System.out.println("비밀번호를 입력하시오.");
		String pw = sc.next();
		final String wrong = "틀립니다.";

		if (id.equals("kim") && pw.equals("1")) {
			System.out.println("로그인 성공");
		} else if (!id.equals("kim") && pw.equals("1")) {
			System.out.println("아이디가 " + wrong);
		} else if (id.equals("kim") && !pw.equals("1")) {
			System.out.println("비밀번호가 " + wrong);
		} else {
			System.out.println("정보가 모두 " + wrong);
		}

	}
}
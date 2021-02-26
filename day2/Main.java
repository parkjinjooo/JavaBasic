package day2;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("########회원관리########");

		join();

	}

	public static void join() {

		System.out.println(" **** 회원가입 창 **** ");
		System.out.println("아이디 입력");
		String id = sc.next();
		System.out.println("비밀번호 입력");
		String pw = sc.next();

		User u = new User();
		u.setId(id);
		u.setPw(pw);
		System.out.println("[가입정보] ID : " + u.getId() + " PW : " + u.getPw());
		login(u);
	}

	public static void login(User u) {

		System.out.println("**** 로그인 창 ****");
		System.out.println("아이디 입력");
		String id = sc.next();
		System.out.println("비밀번호 입력");
		String pw = sc.next();

		if (id.equals(u.getId()) && pw.equals(u.getPw())) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}

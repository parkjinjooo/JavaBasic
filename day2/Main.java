package day2;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("########ȸ������########");

		join();

	}

	public static void join() {

		System.out.println(" **** ȸ������ â **** ");
		System.out.println("���̵� �Է�");
		String id = sc.next();
		System.out.println("��й�ȣ �Է�");
		String pw = sc.next();

		User u = new User();
		u.setId(id);
		u.setPw(pw);
		System.out.println("[��������] ID : " + u.getId() + " PW : " + u.getPw());
		login(u);
	}

	public static void login(User u) {

		System.out.println("**** �α��� â ****");
		System.out.println("���̵� �Է�");
		String id = sc.next();
		System.out.println("��й�ȣ �Է�");
		String pw = sc.next();

		if (id.equals(u.getId()) && pw.equals(u.getPw())) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

	}

}

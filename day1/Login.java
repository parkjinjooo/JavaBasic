package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��Ͻÿ�.");
		String id = sc.next();
		System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
		String pw = sc.next();
		final String wrong = "Ʋ���ϴ�.";

		if (id.equals("kim") && pw.equals("1")) {
			System.out.println("�α��� ����");
		} else if (!id.equals("kim") && pw.equals("1")) {
			System.out.println("���̵� " + wrong);
		} else if (id.equals("kim") && !pw.equals("1")) {
			System.out.println("��й�ȣ�� " + wrong);
		} else {
			System.out.println("������ ��� " + wrong);
		}

	}
}
package day4;

import java.util.Scanner;

public class Mome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		System.out.println("�̸��� �Է��Ͻÿ�.");
		String name = sc.next();
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age = sc.nextInt();
		System.out.println("�̸����� �Է��Ͻÿ�.");
		String email = sc.next();

		Member m = new Member();
		m.setName(name);
		m.setAge(age);
		m.setEmail(email);

		System.out.println("�Է� ���� : \n" 
				+ "�̸� [" + m.getName() + "] \n" 
				+ "���� [" + m.getAge() + "] \n" 
				+ "�̸��� ["+ m.getEmail() + "]");

	}

}

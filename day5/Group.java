package day5;

import java.util.Scanner;

public class Group {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("�̸��� �Է��Ͻÿ�.");
			String name = sc.next();
			System.out.println("������ �Է��Ͻÿ�.");
			int score = sc.nextInt();

			Student s = new Student();
			s.setName(name);
			s.setScore(score);

			arr[i] = s;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println("�Է��Ͻ� �̸��� [" + arr[i].getName() + "]  ������ [" + arr[i].getSore() + "]\n");

		}
	}

}

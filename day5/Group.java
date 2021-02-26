package day5;

import java.util.Scanner;

public class Group {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("이름을 입력하시오.");
			String name = sc.next();
			System.out.println("점수를 입력하시오.");
			int score = sc.nextInt();

			Student s = new Student();
			s.setName(name);
			s.setScore(score);

			arr[i] = s;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println("입력하신 이름은 [" + arr[i].getName() + "]  점수는 [" + arr[i].getSore() + "]\n");

		}
	}

}

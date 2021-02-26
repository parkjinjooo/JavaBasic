package day3;

import java.util.Scanner;

public class UI {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력");
		String ph = sc.nextLine();
		System.out.println("문자 입력");
		String msg = sc.nextLine();
		System.out.println("입력한 정보 : 전화번호 ["+ph+"] 문자 ["+msg+"]");
		
		Kakao k = new Kakao();
		k.setPh(ph);
		k.setmsg(msg);
		
		System.out.println("전송한 정보 : 전화번호 ["+k.getPh()+"] 문자 ["+k.getmsg()+"]");
	text();
		
	}

	public static void text() {
		
		System.out.println("전화번호 입력");
		
		
		
		
		
	}
	
	
	
	
}

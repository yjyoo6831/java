package ex01;

import java.util.Scanner;

public class whileroop {
	public static void run() {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("=====================");
			System.out.println("1.100까지 합계|2.100까지 홀수합|3.100까지 짝수합|0.exit");
			System.out.println("=====================");
			System.out.println("선택>");
			String menu = s.nextLine();
			int even_sum=0;
			int odd_sum=0;
			int sum=0;
			for(int i=1;i<=100;i++) {
				if (i%2==0) {
					even_sum+=i;
				}
				else if(i%2==1){
					odd_sum+=i;
				}
				else
					sum+=i;
			}
			switch (menu) {
			case "1":
				System.out.println(sum);
				break;
			case "2":
				System.out.println(odd_sum);
				break;
			case "3":
				System.out.println(even_sum);
				break;
			case "0":
				System.out.println("프로그램 종료");
				run=false;
				break;
			default:
				System.out.println("선택 0~3");
				
			
			} // switch
		} //while
	}//method
}//class

package ex01;

import java.util.Scanner;

public class Sub09 {
	public static void run() {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		String[] names=new String[100];
		String[] addresses=new String[100];
		String[] phones=new String[100];

		names[0]="예진";
		addresses[0]="서울시";
		phones[0]="777-8888";
		names[1]="예지";
		addresses[1]="서울시";
		phones[1]="111-2222";
		
		int count=2;
		while(run) {
			System.out.println("*********************");
			System.out.println("1.주소등록|2.주소출력|0.종료");
			System.out.println("*********************");
			System.out.print("선택 >>>>> ");
			String menu = s.nextLine();

			switch(menu) {
			case "1":
				System.out.print("name >");
				String name=s.nextLine();
				System.out.print("address >");
				String address=s.nextLine();
				System.out.print("phone >");
				String phone=s.nextLine();
				names[count]=name;
				addresses[count]=address;
				phones[count]=phone;
				count+=1;
				break;
					
			case "2":
				for(int i=0;i<count;i++) {
					System.out.printf("%s\t%s\t%s\n",names[i],addresses[i],phones[i]);
				}
				
				break;
	
			case "0":
				System.out.println("bye bye");
				run=false;
				break;
			default:
				System.out.println("0-2 중 선택 ");
				
				}
			}
		}
}

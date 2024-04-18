package ex01;

import java.util.*;
public class Sub10 {
	public static void run() {
		boolean run=true;
		Scanner s=new Scanner(System.in);
		String[] names=new String[100];
		int[] prices=new int[100];
		int[] qnt=new int[100];
		int count=0;
		
		while(run) {
			System.out.println("\n\n--------------");
			System.out.println("1.매출등록|2.매출현황|3.종료");
			System.out.println("\n\n--------------");
			System.out.print("선택> ");
			String menu=s.nextLine();
			switch(menu) {
			case "1":
				System.out.print("name > ");
				String name=s.nextLine();
				names[count]=name;
				System.out.print("price > ");
				int price=Integer.parseInt(s.nextLine());
				prices[count]=price;
				System.out.print("count > ");
				int qn=Integer.parseInt(s.nextLine());
				qnt[count]=qn;
				count++;
				break;
			case "2":
				if(count < 1) {
					System.out.println("등록된 상품 없음");
				}else {
					for (int i=0;i<count;i++) {
						int sum=prices[i]*qnt[i];
						System.out.printf("%s\t%d만원\t%d개\t%d만원\n*************************\n",names[i],prices[i],qnt[i],sum);
						
					}
				}
				break;
			case "0":
				run=false;
				break;
			default:
				System.out.println("0-2중 선택");
				
			}
		}
	}
}

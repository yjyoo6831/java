package am;

import java.util.Scanner;

public class defaultcode {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		String[] names=new String[100];
		String[] addresses=new String[100];
		String[] phones=new String[100];
		
		
		while(run) {
			System.out.println("**********************");
			System.out.println("\t1.register|2.status|3.exit");
			System.out.println("**********************");
			System.out.print("선택 >>>>> ");
			
			String menu = scan.nextLine();

			switch(menu) {
			case "1":
				break;
			case "2":
				break;
			case "0":
				run=false;
				break;
			default:
				System.out.println("0-2중 선택 ");
				
			}
		}
		System.out.println("byebye! ");
}
}

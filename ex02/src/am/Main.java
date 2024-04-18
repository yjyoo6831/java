package am;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("****************************");
			System.out.println("1.등록|2.출력|3.주소관리|0.종료");
			System.out.println("****************************");
			System.out.print("선택 : ");
			String menu = scan.nextLine();
			switch(menu) {
				case "1": 
					Sub01.run();
					break;
				case "2":
					Sub02.run();
					break;
				case "3":
					Sub03.run();
					break;
				case "0":
					run=false;
					break;
				default:
					System.out.println("0-3 menu 중  선택");
					
			}
			
		}
		System.out.println("byebye! ");
		 
	}

}

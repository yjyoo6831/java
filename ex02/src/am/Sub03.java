package am;
import java.util.*;
public class Sub03 {
	public static void run() {
		System.out.println("주소관리");
		Scanner scan=new Scanner(System.in);
		String[] names=new String[100];
		String[] addresses=new String[100];
		String[] phones=new String[100];
		int count=0;
		boolean run=true;
		while(run) {
			System.out.println("**********************");
			System.out.println("\t1.register|2.status|3.exit");
			System.out.println("**********************");
			System.out.print("선택 >>>>> ");
			
			String menu = scan.nextLine();

			switch(menu) {
			case "1":
				while(true) {
					System.out.print("name : ");
					String name=scan.nextLine();
					if(name==""){
							System.out.println("입력종료");
							break;
					}
					System.out.print("phone : ");
					String phone=scan.nextLine();
					if(phone==""){
						System.out.println("입력종료");
						break;
					}
					System.out.print("address : ");
					String address=scan.nextLine();
					if(address==""){
						System.out.println("입력종료");
						break;
					}
					names[count]=name;
					addresses[count]=address;
					phones[count]=phone;
					
					
				}
				
				
				break;
			case "2":
				if(count==0) {
					System.out.println("There's no address.");
				}else {
					for (int i=0;i<count;i++) {
						System.out.printf("%s\t%s\t%s\t%n",names[i],addresses[i],phones[i]);
					}
					System.out.println(count+ "people is here");
				}
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

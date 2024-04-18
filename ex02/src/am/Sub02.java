package am;
import java.util.*;
public class Sub02 {
	public static void run() {
		System.out.println("매출현황");
		boolean run=true;
		
		Scanner scan=new Scanner(System.in);
		String[] names=new String[100];
		int[] prices=new int[100];
		int[] qnts=new int[100];
		
		names[0]="";
		int count=0;
		int tot_sum=0;
		
		while(run) {
			System.out.println("**********************");
			System.out.println("\t1.register|2.status|3.exit");
			System.out.println("**********************");
			System.out.print("선택 >>>>> ");
			
			String menu = scan.nextLine();

			switch(menu) {
			case "1":
				System.out.print("name > ");
				String name=scan.nextLine();
				names[count]=name;
				System.out.print("price > ");
				String price=scan.nextLine();
				prices[count]=Integer.parseInt(price);
				System.out.print("count > ");
				String qn=scan.nextLine();
				qnts[count]=Integer.parseInt(qn);
				count++;
				break;
			
			case "2":	
				if(count < 1) {
					System.out.println("등록된 상품 없음");
				}
				else {
					for (int i=0;i<count;i++) {
						int sum = prices[i] * qnts[i];
						System.out.printf("%s\t%d만원\t%d개\t%d만원\n",names[i],prices[i],qnts[i],sum);
						tot_sum=tot_sum+sum;
					}
					
				}
				System.out.println("**********************");
				System.out.printf("\t\t\t%,d만원\n",tot_sum);
				System.out.println("**********************");
				System.out.printf("%d 개 상품 등록 완료\n\n\n",count);	
				break;

			case "0":
				break;
			default:
					System.out.println("0-2중 선택 ");
			
				
			} //switch
			} //while
	} //run()
} //class

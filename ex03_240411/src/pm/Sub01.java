package pm;
import java.util.*;
public class Sub01 {
	public static void run() {
		System.out.println("Sub01....");
		boolean run =true;
		Scanner scan=new Scanner(System.in);
		
		ArrayList<Sale> sales=new ArrayList<>();
		Sale s1=new Sale();
		s1.code=100;
		s1.name="TV";
		s1.price=350;
		s1.qnt=15;
		sales.add(s1);
		
		Sale s2=new Sale(101,"세탁기",270,25);
		sales.add(s2);
		
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("| 1.register | 2.list | 3. check | 4. delate | 0. exit |");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택 : ");
			String menu=scan.nextLine();
			switch(menu) {
			case "0":
				
				run=false;
				break;
			case "1":
				Sale s3=new Sale();
				Sale last=sales.get(sales.size()-1);
				System.out.println(typeof(last.code));
				//int code=Integer.parseInt(last.code)+1; //String->int
				int code=last.code;
				
				
				s3.code=String.valueOf(code);  //int ->String
				
				System.out.print("상품코드 : "+s3.code);

				System.out.print("상품이름 : ");			
				s3.name=scan.nextLine();
				
				while(true) {
					System.out.print("상품가격 : ");
					String price=scan.nextLine();
					
					if(checkNumber(price)) {
						s3.price=Integer.parseInt(price);
						break; //while문 빠져나오기
					}
				}
				while(true) {
					System.out.print("판매수량 : ");
					String qnt=scan.nextLine();
					
					if(checkNumber(qnt)) {
						s3.price=Integer.parseInt(qnt);
						break; //while문 빠져나오기
					}
				}
				
				
			case "2": // 매출 목록
				int tot_qnt=0;
				int tot_sum=0;
				for(Sale s:sales) {
					s.print_land();
					tot_qnt=tot_qnt+s.qnt;
					tot_sum=tot_sum+s.sum();
				}
				System.out.println("---------------------------");
				System.out.printf("총 판매 수량 : %d개\n",tot_qnt);
				System.out.printf("총 판매 금액 : %,d만원\n",tot_sum);
				System.out.println(sales.size()+"개 수량이 존재합니다. ");
				
				break;
			case "3":
				while(true) {
					System.out.print("조회할 상품명 or code : ");
					String sname=scan.nextLine();
					
					for (Sale s:sales) {
						if(s.name.equals(sname)||s.code.equals(sname)) {
							s.print_port();
					
						}
						else if(sname == null || sname.isEmpty()) {
							System.out.println("노입력함. 다시 입력 하세요 ");
							
						}
						//else if (!s.name.equals(sname)){
						else {
							System.err.println(sname+"상품이 존재하지 않음");}
						break;
					}
				break;
				}
				
			case "4":
				System.out.print("삭제할 상품명/코드 : ");
				String sname=scan.nextLine();
				for(Sale s:sales) {
					if(s.name.equals(sname)||s.code.equals+""==sname)) {
						s.print_port();
						System.out.print("삭제?y/n");
						String ans=scan.nextLine();
						if(ans.equals("Y")||ans.equals("y")) {
							sales.remove(s);
							System.out.println("삭제완료");
							
						}else {
							System.out.println("삭제 안헸음");
						}
						break;
					}
				if(!s.name.equals(sname)) {
					System.out.println(sname+"상품 존재 X");}
				}
				break;
			default:
					System.out.println("0-4 메뉴 중 선택 ");
					
				
			}//switch
		}//while
		System.out.println("BY~~~~~~~E😀😀");
		
		} //method
	// 숫자인지 아닌지 판별하는 메소드
		public static boolean checkNumber(String str) {
			try {
				int num=Integer.parseInt(str);
				return true;
			}catch(Exception e) {
				System.out.println("숫자로 입력 ㄱ");
				return false;
			}
		
	}
}

package sale;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		SaleDAO dao=new SaleDAO();
		
		while(run) {
		// TODO Auto-generated method stub
			System.out.println("========= Sale Management ==========");
			System.out.println("1. 판매등록 |2. 판매조회 |3. 판매목록 |4. 판매삭제 |0. exit");
			System.out.println("===================================");
			
			System.out.println("선택 : ");
			String menu=scan.nextLine();
			switch(menu) {
			case "1":
				//새 상품 코드 생성 
				 
				Sale sa1=new Sale();
				
				ArrayList<Sale> list=dao.list();
				Sale lastSale=list.get(list.size()-1);
				int newCode=lastSale.getCode()+1;
				System.out.println("code : " + newCode);
				
				System.out.println("name : "); 
				String name=scan.nextLine(); if(name=="") break;
				while(true) {
					System.out.println("price : ");
					String price=scan.nextLine(); if(price=="") break;
											
					System.out.println("quantity : ");
					String qnt=scan.nextLine(); if(qnt=="") break;
					sa1.setCode(newCode);
					sa1.setName(name);
					sa1.setPrice(Integer.parseInt(price));
					sa1.setQnt(Integer.parseInt(qnt));
					dao.insert(sa1);
					System.out.println("매.등.완.!");
				}

				break;
			case "2":
				while(true) {
					System.out.println("조회할 코드 : ");
					String code=scan.nextLine();
					
					if(code=="") break;
//					if(check(code)) {
//						Sale sale1=dao.read(Integer.parseInt(code));
//						if(sale1.getName()==null) {
//							System.out.println(code+"매출정보 존재 X");
//						}
//						
//						System.out.println("이름 : "+sale1.getName());
//						System.out.println("가격 : "+sale1.getPrice());
//						System.out.println("수량 : "+sale1.getQnt());
//						System.out.println("삭제하실래요 ? ");
//						
//					}
				}
				break;
			case "3":
				ArrayList<Sale> array=dao.list();
				for(Sale s:array) {
					System.out.printf("%d\t%s\t%d만원\t%d개\t%,d만원\n",s.getCode(),s.getName(),s.getPrice(),s.getQnt(),s.getPrice()*s.getQnt());
					
				}
				break;
			case "4":
				break;
			case "0":
				run=false;
				break;
			default:
				System.out.println("0-4중 입력");
			} //switch
		} //while
		System.out.println("프로그램을 종료");
	} //method
	public static boolean check(int code) {
		try {
			int num=code;
			return true;
		}catch(Exception e) {
			System.out.println("숫자로 입력 ㄱㄱ");
			return false;
		}
		
	}
}

package sale;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import product.ProductDAO;
import product.ProductVO;

public class Sub {
	public static void run() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		SaleDAO dao=new SaleDAO();
		ProductDAO pd=new ProductDAO();

		while(run) {
			System.out.println("\n===========[매출관리 메뉴]=================");
			System.out.println("1.판매등록|2.판매조회|3.판매현황|4.판매삭제|0.종료");
			System.out.println("========================================");
			System.out.println("선택>");
			String menu= scanner.nextLine();
			switch(menu) {
			case "6" :
				break;
			case "1" :
				System.out.println("등록할 code : ");
				String c1=scanner.nextLine();
				ProductVO v1=pd.read(c1);
				if(v1.getCode()==null) {
					System.out.println("ERROR : "+ c1+"상품 없음");
				}
				else {
					SaleVO svo=new SaleVO();
					svo.setCode(c1);
					
					System.out.println("상품명 : " + v1.getName());
					String td=sdf.format(new Date());
					
					System.out.print("판매일 "+td +" > ");
					String date=scanner.nextLine();
					
					if(date!="") {
						svo.setSale_date(date);
					}else {
						svo.setSale_date(td);
					}
					System.out.print("판매가 :" + v1.getPrice()+">");
					String price=scanner.nextLine();
					if(price!="") {
						svo.setPrice(Integer.parseInt(price));
					}else svo.setPrice(v1.getPrice());
					System.out.print("수량 >");
					String qnt=scanner.nextLine();
					if(price!="") {
						svo.setQnt(Integer.parseInt(qnt));
					}else svo.setQnt(1);				
										
					System.out.println(svo.toString());
					dao.insert(svo);
					System.out.println("매.등.완.");
				}
				break;
			case "2" :
				System.out.println("조회할 상품 코드 ->");
				String c2=scanner.nextLine();
				ProductVO v2=pd.read(c2);
				if(v2.getCode()==null) {
					System.out.println("ERROR : "+ c2+"상품 없음");
				}
				else {
					System.out.println("이름 : " + v2.getName());
					System.out.println("단가 :" + df.format(v2.getPrice()));
				}
				
				
				break;
			case "3" :
				for(SaleVO vo : dao.list()) {
					System.out.printf("%s\t%s(%s)\t%d개\t%d원\n",vo.getSale_date(),vo.getName(),vo.getCode(),vo.getQnt(),vo.getPrice());
				}
				break;
			case "4" :
				break;
			case "5" :
				break;
			case "0" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("0~4 메뉴를 입력하세요!");
				break;
			}//switch   
		}//while
	}
}

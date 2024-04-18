package product;
import java.text.SimpleDateFormat;
import sale.Sub;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			boolean run = true;
			Scanner scanner = new Scanner(System.in);
			Date today=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
			System.out.println("오늘은 "+sdf.format(today));
			ProductDAO dao=new ProductDAO();

			while(run) {
				System.out.println("\n==========[Main menu]==================");
				System.out.println("1.등록|2.조회|3.목록|4.삭제|5.수정|6.매출관리|0.종료");
				System.out.println("========================================");
				System.out.println("선택>");
				String menu= scanner.nextLine();
				switch(menu) {
				case "6":
					Sub.run();
					break;
				case "1" :
					ProductVO vo1=new ProductVO();
					vo1.setCode(dao.getCode());
					System.out.println("code : "+vo1.getCode());
					System.out.print("상품이름 : ");
					String n1=scanner.nextLine();
					if(n1=="") {System.out.println("상품등록취소 "); break;}
					else {
						vo1.setName(n1);
					}
					while(true) {
						System.out.print("price : ");
						String price1=scanner.nextLine();
						if(price1!="" && isNumber(price1)) {
							vo1.setPrice(Integer.parseInt(price1));
							System.out.println(vo1.toString());
							dao.insert(vo1);
							System.out.println("상.등.완 ^~^");
							
							break;
						}
						
					}
					
					break;
				case "2" : //조회
					System.out.println("조회할 상품 코드 :");
					String c2=scanner.nextLine();
					if(c2=="") {
						System.out.println("조회작업을 취소합니다");
						break;
					}
					ProductVO v2=dao.read(c2);
					if(v2.getCode()==null) {
						System.out.println(c2+"번 상품이 존재하지 않음");
					}else {
						System.out.println(v2.toString());
					}
					
					break;
				case "3" : //상품목록
					//ArrayList<ProductVO> array=dao.list();
					//for(ProductVO vo:array.list()) {
					for(ProductVO vo:dao.list()) {
						System.out.println(vo.toString());
					}
					break;
				case "4" : //delete
					System.out.println("delete code:");
					String c4=scanner.nextLine();
					ProductVO vo4=dao.read(c4);
					if(vo4.getCode()==null) {
						System.out.println(c4+"번 상품이 존재하지 않음");
					}else {
						System.out.println(vo4.toString());
						System.out.print("정말로 삭제하실? y/n");
						String sel=scanner.nextLine();
						if(sel.equals("Y")||sel.equals("y")) {
							//db 삭제
							if(dao.delete(c4)) {
								System.out.println("상품 삭제 완료");
							}else {
								System.out.println("상품 삭제 실패!");
							}
						}else {
							System.out.println("삭제 취소 ");
						}
					}
					
					break;
				case "5":
					System.out.print("update code :");
					String c5=scanner.nextLine();
					ProductVO vo5=dao.read(c5);
					if(vo5.getCode()==null) {
						System.out.println(c5+" 상품이 존재하지 않음.");
					}else {
						System.out.print("상품 이름 :"+vo5.getName() + " > ");
						String n5=scanner.nextLine();
						if(!n5.equals("")) vo5.setName(n5);
					}
					while(true) {
							System.out.print("상품 단가 :" + vo5.getPrice() + " > ");
							String p5=scanner.nextLine();
							if(isNumber(p5)) { //숫자인경우
								vo5.setPrice(Integer.parseInt(p5));
								break;
							} //if
						
					}//while
					System.out.print("정말로 수정하실? y/n");
					String sel5=scanner.nextLine();
					if(sel5.equals("Y")||sel5.equals("y")) { //db 수정
						dao.update(vo5);			
						System.out.println("상품 수정 완료");
					} //if
					System.out.println(vo5.toString());
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
	public static boolean isNumber(String str){ //whether value is number or no
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			System.out.println("숫자를 입력하3");
				return false;
		}
	} //isNumber() method

} //class

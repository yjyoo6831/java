package mybox;
import java.util.*;
public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			boolean run = true;
			Scanner scanner = new Scanner(System.in);

			while(run) {
				System.out.println("\n============================");
				System.out.println("1.등록|2.조회|3.목록|4.삭제|5.수정|6.매출관리|0.종료");
				System.out.println("============================");
				System.out.println("선택>");
				String menu= scanner.nextLine();
				switch(menu) {
				case "6" :
					break;
				case "1" :
					break;
				case "2" :
					break;
				case "3" :
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

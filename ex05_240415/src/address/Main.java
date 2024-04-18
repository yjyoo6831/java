package address;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		AddressDAO dao=new AddressDAO();
		while(run) {
		// TODO Auto-generated method stub
			System.out.println("========= Manage Address ==========");
			System.out.println("1. 판매등록 |2. 판매조회 |3. 판매목록 |4. 판매삭제 |0. exit");
			System.out.println("===================================");
			
			System.out.println("선택 : ");
			String menu=scan.nextLine();
			switch(menu) {
			case "1":
				
				Address ad1=new Address();
				System.out.println("번호 : ");
				String no=scan.nextLine();
				ad1.setNo(Integer.parseInt(no));
				System.out.println("이름 : ");
				String name=scan.nextLine(); if(name=="") break;
				ad1.setName(name);
				System.out.println("폰 : ");
				String phone=scan.nextLine(); if(phone=="") break;
				ad1.setPhone(phone);
				System.out.println("주소 : ");
				String address=scan.nextLine(); if(address=="") break;
				ad1.setAddress(address);
				dao.insert(ad1);
				System.out.println("주.등.완.!");
				break;
			case "2":
				
				System.out.println("조회할 이름 : ");
				name=scan.nextLine();
				Address ad=dao.read(name);
				if(ad.getName() ==null) {
					System.out.println(name+"은/는 존재 X");	
				}else {
					System.out.println("번호 : "+ad.getNo());
					System.out.println("폰 번호 : "+ad.getPhone());
					System.out.println("주소 : "+ad.getAddress());
				}
				
				break;
			case "3":
				ArrayList<Address> array=dao.list();
				for (Address j:array) {
					System.out.println(j.toString());
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
	} //main
}  //class

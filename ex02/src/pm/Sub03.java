package pm;
import java.util.*;
public class Sub03 {
	public static void run() {
		while(true) {
			
			// 주소 관리 프로그램 
			
			System.out.println("**********************");
			System.out.println("\t1. address register|2.search name|3.show list|4.address delate|0.exit");
			System.out.println("**********************");
			System.out.print("선택 >>>>> ");
			Scanner scan=new Scanner(System.in);
			ArrayList<String> names=new ArrayList<>();
			ArrayList<String> adds=new ArrayList<>();
			
			names.add("동길");adds.add("인천");
			names.add("청심");adds.add("설");
			names.add("dPwls");adds.add("캐나다");
			
			
			String menu = scan.nextLine();
			
			switch(menu) {
			case "1":{
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
				break;
			}
			case "2":
				boolean kk=true;
				while(kk) {
					System.out.print("검색할 이름 : ");
					String sname=scan.nextLine();
					for (int i=0;i<=names.size();i++) {
						String name=names.get(i);
						if (sname.equals(name)) {
							System.out.printf("address : %s",adds.get(i));
							break;
						}
						else {
							System.out.println("존재 X");
						}
					}
				} //while
				break;
			case "3":
				for (int i=0;i<names.size();i++) {
					
					System.out.printf("%s\t%s\n",names.get(i),adds.get(i));
					}
				System.out.printf("%s명 존재\n",adds.size());
				
				break;
			
			case "4":
				System.out.print("삭제할 이름 : ");
				String rname=scan.nextLine();
				boolean find=false;
				for (int i=0;i<=names.size();i++) {
					System.out.println(names.get(i));
					String name=names.get(i);
					if (rname.equals(name)) { //if1
						System.out.printf("Searched.\nname: %s\taddress : %s",names.get(i),adds.get(i));
						find=true;
						System.out.print("\n삭제 ? Y/N ?\n");
						String ans=scan.nextLine();
						if(ans.equals("Y")||ans.equals("N")) {
							names.remove(i);
							adds.remove(i);
							System.out.println("삭제 완료");
							break;
						} //if
						else {System.out.println("삭제 취소");}
					} //if1
					else {
						System.out.printf("\n%s 이름 없음 ",rname);
					}
				} //for
				break;
			
			case "0":{
				
				System.out.println("BYE");
				break;
			}
			default:
				System.out.println("0-4까지 선택해");
			
			} //switch
		} //while
	} //run()
}

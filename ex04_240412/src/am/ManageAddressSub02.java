package am;
import java.util.*;
public class ManageAddressSub02 {
	public static void run() {
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		ArrayList<Address> addresses=new ArrayList<>(); 
		Address ad1=new Address("yj","8669-0000","seoul");
		addresses.add(ad1);
		ad1=new Address("yj1","8669-1111","daejeon");
		addresses.add(ad1);
		ad1=new Address("yp","8669-8694","incheon");
		addresses.add(ad1);
		
		while(run) {
			
			System.out.println("**********************");
			System.out.println("\t1.register address|2.search name|3.show list|4.address delate|0.exit");
			System.out.println("**********************");
			System.out.print("선택 >>>>> ");
			String menu=scan.nextLine();
			switch(menu) {
			case "1": //주소등록
				Address ad=new Address();
				System.out.print("이름 : ");
				String name=scan.nextLine();
				System.out.print("주소 : ");
				String iad=scan.nextLine();
				ad.setAddress(iad);
				System.out.print("전화 : ");
				String iph=scan.nextLine();
				ad.setPhone(iph);
				addresses.add(ad);
				
				System.out.println(ad.toString()+"\n 등.완. !");
				System.out.println("등록된 데이터: "+addresses.size());
				break;
				
			case "2":
				while(true) {
					System.out.print("조희할 이름:");
					String sname=scan.nextLine();
					boolean find=false;
					for (Address j:addresses) {
						if(sname.equals(j.getName())) {
							System.out.println("주소 : "+j.getAddress());
							System.out.println("폰 : "+j.getPhone());
							find=true;
						} //if
					} //for
					if(!find) {
						System.out.println(sname+"은 없는 데.이.터.");
						break;
					}
				}//while 
				break;
			case "3":
				for (Address j:addresses) {
					System.out.printf("%s\t%s\t%s\n",j.getName(),j.getPhone(),j.getAddress());
				}
				System.out.println("등록된 데이터: "+addresses.size());
				break;
			case "4": //주소 삭제
				System.out.print("삭제할 이름:");
				String sname=scan.nextLine();
				sname=scan.nextLine();
				boolean find=false;
				
				for (Address j:addresses) {
					if(sname.equals(j.getName())) { //if2
						System.out.println("주소 : "+j.getAddress());
						System.out.println("폰 : "+j.getPhone());
						find=true;
					
						System.out.print("삭제하십니까?(y/n)");
						String ans=scan.nextLine();
						if(ans.equals("Y")||ans.equals("y")) { //if1
							addresses.remove(j);
							System.out.println("삭제완료");
							break;
						} //if1
						else {System.out.println("삭제취소");}
					} //if2
					if(!find) {
						System.out.println(sname+"은 없는 데.이.터.");
				} 
				
				} //for
				 
				break;
			
			case "0":
				System.out.println("B   Y   E");
				run=false;
				break;
			default:
				System.out.println("0-4중 입력");
				
			}
		}
	}
}

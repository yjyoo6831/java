package pm;
import java.util.*;
public class Sub01 {
		public static void main(String[] args) {
			
			ArrayList<String> names=new ArrayList<>();
			names.add("동길");
			names.add("청심");
			names.add("dPwls");
			names.remove(1);
			
			Scanner scan=new Scanner(System.in);
			
			for (int i=0;i<names.size();i++) {
				String name=names.get(i);
				System.out.println(name);	
			}
			while(true) {
				System.out.print("검색할 이름 : ");
				String sname=scan.nextLine();
				if(sname=="") {
					System.out.println("검색 종료");
					break;
				}
				
				boolean find=false;
				for (int i=0;i<names.size();i++) {
					String name=names.get(i);
					if(sname.equals(name)) {
						find=true;
						System.out.println("존재합니다.");
					}
					else {
						
					}
				}
				if(find==false) {
					System.out.println("존재 X");
				}
		 	} //while
			
		}
	}



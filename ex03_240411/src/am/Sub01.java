package am;
import java.util.*;
// ArrayList 를 이용한 성적 등록 관리 프로그램
public class Sub01 {
	public static void run() {
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<String>();
		ArrayList<Integer> kors=new ArrayList<>();
		ArrayList<Integer> engs=new ArrayList<>();
		ArrayList<Integer> maths=new ArrayList<>();
		names.add("dPwls");kors.add(98);engs.add(88);maths.add(99);
		names.add("cat");kors.add(35);engs.add(66);maths.add(89);
		//int count=2;
		//int sum=0;
		//double avg=0;
		//String grade="";
		
		while(run) {
			System.out.println("\n--------------------------");
			System.out.println("1.register | 2.score list | 3. check score| 4. delate score | 0. exit");
			System.out.println("--------------------------");
			System.out.println("선택 : ");
			String menu=scan.nextLine();
			switch(menu) {
			case "0":
				System.out.print("이름 : ");
				String name=scan.nextLine();
				System.out.print("국어 성적 입력 : ");
				String kor=scan.nextLine();
				System.out.print("영어 성적 입력 : ");
				String eng=scan.nextLine();
				System.out.print("수학 성적 입력 : ");
				String math=scan.nextLine();
				run=false;
				break;
				
			case "1":
				break;
				
			case "2":
				System.out.println("name\tkor\teng\tmath\ttotal\tavg");
				double kor_avg=0;
				double eng_avg=0;
				double math_avg=0;
				for (int i=0;i<names.size();i++) {
					
					int total=kors.get(i)+engs.get(i)+maths.get(i);
					double avg=total/names.size();
				
					kor_avg+=kors.get(i)/names.size(); eng_avg+=engs.get(i)/names.size(); math_avg+=maths.get(i)/names.size();
					
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",names.get(i),kors.get(i),engs.get(i),maths.get(i),total,avg);
				}//for	
				//System.out.printf("kor_avg : %.2f\teng_avg : %.2f\tmath_avg : %.2f\n",kor_avg,eng_avg,math_avg);
				
				
				
				System.out.println(names.size()+"명 성적 존재");
				
				
				break;
			case "3":
				System.out.print("검색할 이름 : ");
				String sname=scan.nextLine();
				if(sname=="") {
					System.out.println("검색 종료");
					break;
				}
				
				boolean find=false;
				for (int i=0;i<names.size();i++) {
					String iname=names.get(i);
					if(sname.equals(iname)) {
						find=true;
						System.out.println("존재합니다.");
					}
					
				}
				if(find==false) {
					System.out.println("존재 X");
				}
				break;
			case "4":
				System.out.print("삭제할 이름 : ");
				String rname=scan.nextLine();
				boolean rfind=false;
				for (int i=0;i<=names.size();i++) {
					System.out.println(names.get(i));
					String riname=names.get(i);
					if (rname.equals(riname)) { //if1
						System.out.printf("Searched.\nname: %s",names.get(i));
						find=true;
						System.out.print("\n삭제할거니? Y(y)/N(n) ?\n");
						String ans=scan.nextLine();
						if(ans.equals("Y")||ans.equals("y")) {
							names.remove(i);
							System.out.println("삭제 완료");
							break;
						} //if
						else {System.out.println("삭제 취소됨");}
					} //if1
					else {
						System.out.printf("\n%s 이름 없음 ",rname);
						break;
					}
				} //for
				break;
			default:
				System.out.println("0-4중 메뉴 선택");
			} //switch
		}//while
		System.out.println("Bye ~~~~~~😀😀😀😀");
	}
}

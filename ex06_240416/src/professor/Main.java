package professor;

import java.sql.Connection;
import java.util.*;
import java.text.SimpleDateFormat;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     boolean run = true;
	      Scanner scanner = new Scanner(System.in);
	      ProDAO dao=new ProDAO();
	      
	      while(run) {
	         System.out.println("\n=========================================");
	         System.out.println("1. 등록|2. 조회|3. 목록|4. 삭제|5. 수정|0. 종료");
	         System.out.println("=========================================");
	         System.out.println("선택>");
	         String menu= scanner.nextLine();
	         switch(menu) {
	            case "1" : //입력
	            	ProVO vo=new ProVO();
	            	int code=dao.getCode();
	            	System.out.println("코드 : "+code);
	            	vo.setPcode(String.valueOf(code));
	            	//String pcode=scanner.nextLine(); 
	            	
	            	
	            	System.out.println("성함 : ");
	            	String pname=scanner.nextLine(); 
	            	if(pname=="") {System.out.println("등록 취소");break;}
	            	vo.setPname(pname);
	            	dao.insert(vo);
	            	System.out.println("교.등.완!");
	            	
	            	
	            	break;
	            case "2" : //조회
	            	while(true) {
	            		System.out.println("번호 : ");
		            	String code2=scanner.nextLine();
		            	if(code2=="") {
		            		System.out.println("조회 취소");
		            		break;
		            	}
		            	ProVO vo1=dao.read(code2);
		            	System.out.println(vo1.toString());
		            	if(vo1.getPcode()==null) {
		            		System.out.println("정보 없음");
		            	}
		            	else {
		            		System.out.println(vo1.toString());
		            	}
	            	}
	            	break;
	            case "3" : //목록 출력
	            	for(ProVO v:dao.list()) {
	            		String date="미등록";
	            		if(v.getHiredate()!=null) {
	            			date=v.getHiredate().substring(0,10);
	            		}
	            		String dept="미등록";
	            		if(v.getDept()!=null) {
	            			dept=v.getDept();
	            		}
	            		String title="미등록";
	            		if(v.getTitle()!=null) {
	            			title=v.getTitle();	            	
	            		}
	            		
	            		System.out.printf("%s\t%s\t%s\t%s\t%s\t%,10d원\n",v.getPcode(),v.getPname(),dept,title,date,v.getSalary());
	            	} //for
	               break;
	            case "4" : //삭제
	            	System.out.print("삭제하고 싶은 교수 코드 : ");
	            	String code4=scanner.nextLine();
	            	ProVO vo4=dao.read(code4);
	            	if(vo4.getPcode()==null) {
	            		System.out.println(code4 + " 정보 없음");
	            	}else {
	            		System.out.print(vo4.toString() + vo4.getPname() + "\n"
	            				+ "삭제 ? y/n");
	            		String sel=scanner.nextLine();
	            		if(sel.equals("Y")||sel.equals("y")) {
	            			dao.delete(code4);
	            			System.out.println("삭.완.!");
	            		}
	            		else {
	            			break;
	            		}
	            		
	            	}
	               break;
	            case "5" :
	            	System.out.print("수정할 교수 번호 : ");
	            	String code5=scanner.nextLine();
	            	ProVO vo5=dao.read(code5); //수정 전값
	            	
	            	if(vo5.getPcode()==null) System.out.println(code5 + " 존재 X");
	            		
	            	else {
	            		System.out.print("교수이름 : "+vo5.getPname()+" >");
	            		String pn5=scanner.nextLine();
	            		if(!pn5.equals("")) vo5.setPname(pn5);
	            		
	            		System.out.print("교수학과 : "+vo5.getDept()+" >");
	            		String dp5=scanner.nextLine();            		
	            		if(!dp5.equals("")) vo5.setDept(dp5);
	            		
	            		//SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");
	            		
	            		
	            		System.out.print("교수직급 : "+vo5.getTitle()+" >");
	            		String t5=scanner.nextLine();            		
	            		if(!t5.equals("")) vo5.setTitle(t5);
	            		System.out.println(vo5.toString());
	            		
	            		System.out.print("salary : " + vo5.getSalary()+" >");
	            		//int s5=Integer.parseInt(scanner.nextLine());
	            		String s5=scanner.nextLine();
	            		
	            		if(!s5.equals("")) vo5.setSalary(Integer.parseInt(s5));
	            		
	            		System.out.println(vo5.toString());
	            		System.out.print("수정하실? (y/n)");
	            		String ans=scanner.nextLine();
	            		
	            		if(ans.equals("Y")|| ans.equals("y")) {
	            			dao.update(vo5);
	            			System.out.println("수정 완");
	            		}else {
	            			System.out.println("수정 cancel");
	            		}
	            		
	            		
	            	}
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
	   }//method
	}

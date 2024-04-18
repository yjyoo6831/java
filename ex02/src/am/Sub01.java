package am;
import java.util.*;
public class Sub01 {
	 public static void run() {
		 System.out.println("성적관리 프로그램");
		 boolean stop=false;
		 Scanner scan=new Scanner(System.in);
		 String[] names=new String[100];
		 int[] kors=new int[100];
		 int[] engs=new int[100];
		 int[] maths=new int[100];
		 names[0]="dog";kors[0]=98;engs[0]=88;maths[0]=99;
		 names[1]="cat";kors[1]=9;engs[1]=8;maths[1]=9;
		 int count=2;
		 int sum=0;
		 double avg=0;
		 String grade="";
		 
		 
		 while (!stop) {
			 System.out.println("****************************");
			 System.out.println("1.등록|2.출력|0.종료");
			 System.out.println("****************************");
			 System.out.print("선택 : ");
			 String menu = scan.nextLine();
			 
			 switch(menu) {
			 case "1":
				 System.out.print("name : ");
				 String name=scan.nextLine();
				 System.out.print("korean : ");
				 String kor=scan.nextLine();
				 System.out.print("eng : ");
				 String eng=scan.nextLine();
				 System.out.print("math : ");
				 String math=scan.nextLine();
				 names[count]=name;
				 kors[count]=Integer.parseInt(kor);
				 engs[count]=Integer.parseInt(eng);
				 maths[count]=Integer.parseInt(math);
				 System.out.printf("%s 학생 등록 완료",name);
				 count+=1;
				 break;
			 case "2":
				 float kor_avg=0;
				 float eng_avg=0;
				 float math_avg=0;
				 for (int i=0;i<count;i++) {
					 sum=kors[i]+engs[i]+maths[i];
					 avg=(kors[i]+engs[i]+maths[i])/3;
					 
					 if (avg>=90) {
						 grade="A0"; 
						 if (avg>=95) {
							 grade="A+";
						 }	
					 }
					 else if (avg>=80) {
						 grade="B0"; 
						 if (avg>=85) {
							 grade="B+";
						 }	
					 }
					 else if (avg>=70) {
						 grade="C0"; 
						 if (avg>=75) {
							 grade="C+";
						 }	
					 }
					 else if (avg>=60) {
						 grade="D0"; 
						 if (avg>=65) {
							 grade="D+";
						 }	
					 }
					 else { grade="Fail"; }
					 
					 kor_avg=kors[i]/count;
					 eng_avg=engs[i]/count;
					 math_avg=maths[i]/count;
					 
					 
					 System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",names[i],kors[i],engs[i],maths[i],sum,avg,grade);
					 

					 
					 
				 }
				 System.out.printf("%d명 학생이 존재함\n",count);
				 System.out.printf("kor avg: %.2f\t eng avg : %.2f\tmath avg : %.2f\n",kor_avg,eng_avg,math_avg);
				 
				 break;
			 case "0":
				 stop=true;
				 System.out.println("종료");
				 break;
			
			default:
				System.out.println("0-2중 선택");
			
			
				 
			 }
			 
			 
			 
		 }
		 
	 }
}

package ex01;

public class array {
	public static void run() {
		//int[] scores=new int[] {90, 30, 35, 91, 98, 39, 34, 34, 343242};
		//for (int i=0;i<scores.length;i++) {
		//	System.out.println(scores[i]);
		//}
		int[] no=new int[] {1,2,3};
		String[] name=new String[] {"예진", "yejin1","ye2"};
		String[] address=new String[] {"seoul","busan","daejeon"};
		for(int i=0;i<no.length;i++) {
			System.out.println(no[i] + "\t" + name[i] + '\t' + address[i]);
			System.out.println("***********");
			//System.out.println(no[i] + '\t' + name[i] + '\t' + address[i]);
		}
		
		int[] kor= new int[] {90,99,92};
		int[] eng= new int[] {20,29,22};
		int[] math= new int[] {50,59,52};
		
		for(int i=0;i<no.length;i++) {
			int tot=kor[i]+eng[i]+math[i];
			double avg =tot/no.length;
			String grade="";
			if(avg>=90) {
				if(avg>=95) {
					grade="A+";
				}
				else {
					grade="A0";
				}
				
			}
			else if(avg>=80) {
				if(avg>=85) {
					grade="B+";
				}
				else {
					grade="B0";
				}
				
			}
			else if(avg>=60) {
				if(avg>=65) {
					grade="C+";
				}
				else {
					grade="C0";
				}
				
			}
			else {
				grade="F";
			}
			System.out.printf("\n%d\t%s\t%d\t%.3f\t%s\n",no[i],name[i],tot,avg,grade);
			
		}
		
		
		
	}
}

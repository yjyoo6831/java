package ex01;

public class Sub06 {
	public static void run() {
		int even_sum=0;
		int odd_sum=0;
		for(int i=1;i<=100;i++) {
			if (i%2==0) {
				even_sum+=i;
			}
			else {
				odd_sum+=i;
			}
			
		}
		System.out.printf("even_sum : %d\nodd_sum :%d\n",even_sum,odd_sum);
		
		int i=1;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i=i+1;
		}
		System.out.println("1~100 total : " + sum);
		
		
		
		
		
	
	}
}

package ex01;

public class Sub03 {
	public static void run() {
		//integer type
		int num1=10;
		
		// float type
		float num2 = 11.5f; 
		double num3 = 12.5;  // float 과 같은 실수 타입이지만, double  은 float 보다 공간이 두배로 f를 안붙여도 됨. 
		
		System.out.printf("num : %d \nnum2 : %f\nnum3 : %f\n",num1,num2,num3);
		
		//change type ( int -> float)
//		num2=num1;
//		System.out.println("num2 : "+num2);
//		num3=num1;
//		System.out.println("n3 : "+num3);
		
		//change type ( float -> int)
		num1 = (int)num2;
		System.out.println("num1 = "+num1);
		num1 = (int)num3;
		System.out.println("num1 = "+num1);
		
		
		
		
		//charactor type
		char str='A';
		String	str2="예진";
		System.out.println("str1="+str);
		System.out.println("str2="+str2);
		//boolean type
		boolean bool1=true;
		boolean b2 = false;
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + b2);
		
	}

}

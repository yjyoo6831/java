package ex01;

public class Sub04 {
	public static void run() {
		// 산술 연산자
		int num1=11;
		int num2=3;
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		float div=(float)num1/num2;
		
		System.out.printf("%d + %d = %d\n",num1,num2,sum);
		System.out.printf("%d - %d = %d\n",num1,num2,sub);
		System.out.printf("%d * %d = %d\n",num1,num2,mul);
		System.out.printf("%d / %d = %f\n",num1,num2,div);
		
		//관계 연산자
		boolean result=num1>num2;
		System.out.printf("%d 이 %d 보다 큼 : %b\n",num1,num2,result);
		
		result=num1<num2;

		//System.out.println(result.getClass().getName());
		System.out.printf("%d 이 %d 보다 작 : %b\n",num1,num2,result);
		
		result=num1==num2;
		System.out.printf("%d 과 %d 같음 : %b\n",num1,num2,result);
		
		result=num1!=num2;
		System.out.printf("%d 과 %d 같지않음 : %b\n",num1,num2,result);
		
		//논리연산자 
		boolean b1=true;
		boolean b2=false;
		result = b1&&b2;
		System.out.println(result);
		result = b1||b2;
		System.out.println(result);
		result = !b1;
		System.out.println(result);
		
		
	}
}

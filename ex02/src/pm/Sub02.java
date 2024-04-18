package pm;
import java.util.*;
public class Sub02 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> nums=new ArrayList<>();
	
		while(true) {
			System.out.print("수입력 : ");
			String num=scan.nextLine();
			if(num=="") {
				System.out.println("입력을 종료합니다");
				break;
			}
			else {
				nums.add(Integer.parseInt(num));
			}
			
		}
		//데이터 개수, 수합계, 수평균 출력
		System.out.printf("데이터개수:%d\n",nums.size());
		int sum=0;
		for (int i=0;i<nums.size();i++) {
			sum+=nums.get(i);
		}
		System.out.printf("합계 : %d\n",sum);
		System.out.printf("평균 : %.2f",sum/(float)nums.size());
	}
}

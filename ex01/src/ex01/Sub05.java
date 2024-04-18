package ex01;

public class Sub05 {
	public static void run() {
		// control loop
		int score=60;
		String grade = "";
		
		if (score>=90) {
			grade="A";
		}
		else if(score>=80){
			grade="B";
		}
		else if(score>=70) {
			grade="C";
		}
		else if(score>=60) {
			grade="D";
		}
		else {
			grade="넌 성적이 아냐";
		}
		System.out.printf("%d score : %s\n",score,grade);
		
		int hour=21;
		switch(hour) {
		case 6:
			System.out.println("wake up!");
			break;
		case 9:
			System.out.println("get on work");
			break;
		case 12:
			System.out.println("lunch time");
			break;
		case 18:
			System.out.println("get off work");
			break;
		default :
			System.out.println("....");
		}
	}
}

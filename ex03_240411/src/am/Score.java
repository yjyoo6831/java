package am;

public class Score {
	//필드(속성)
	String name;
	int kor;
	int eng;
	int math;
	//생성자 constructor
	public Score() {
		}
	public Score(String name,int kor,int eng,int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}
	//return 값을 돌려줄 타입을 public 메소드첫줄에 적어줌
	public double total() {
		int total=kor+eng+math;
		return total;
		
	}
	public double avg() {
		double avg=(kor+eng+math)/3;
		return avg;
	}
	public void print() {
		System.out.printf("%s \t %d \t %d \t %d \t %d %.2f \t %s\n"
						,name,kor,eng,math,total(),avg(),grade());
		return ;
	}
	public String grade() {
		String grade="F";
		if(avg()>=90) {
			if(avg()>=95) {
				grade="A+";
			}else {
				grade="A0";
				}
			
		}else if(avg()>=80) {
			if(avg()>=85) {
				grade="B+";
			}else {
				grade="B0";
				}
			
		}else if(avg()>=70) {
			if(avg()>=75) {
				grade="A+";
			}else {
				grade="A0";
				}
			
		}else {
			grade="Fail";
		}
		
		return grade;
	}
	
}

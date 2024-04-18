package am;

public class Student {
	//필드(속성) : 공통적인 값을 가지는 것 
	String no;
	String name;
	String address;
	String phone;
	//같은 이름으로 생성자 여러개를 만들 수 있다, 이거를 오버로딩이라고 함
	//생성자1 
		public Student() {
			
		}
	//생성자2
	public Student(String no, String name) {
		super(); //생략가능
		this.no = no; //no 매개변수를 this.no 에 넣는다 
		this.name = name;
	}

	
	public Student(String no, String name, String address, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	//method - 명령어의 집합 - 처리나 동작을 여기에 씀
	public void print() {
		System.out.printf("학번:%s 이름:%s 주소:%s 전화:%s\n",no,name,address,phone);
	}
	
	
}

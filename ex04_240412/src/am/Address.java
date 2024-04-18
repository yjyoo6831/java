package am;

public class Address { //자바빈

	private int no;
	private String name;
	private String phone;
	private String address;
	
	//기본 생성자 -> 생성자 오버로딩을 하려면 기본 생성자를 만들어줘야함 . 생성자가 기본생성자만 있을떄는 문제 X
	public Address() {
		
	}
	public Address(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "address [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
}



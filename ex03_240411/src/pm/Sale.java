package pm;

public class Sale {
	//field
	int code;
	String name;
	int price;
	int qnt;
	
	
	public Sale(int code, String name, int price, int qnt) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.qnt = qnt;
	}
	public Sale() {
		}
	//금액 구하는 메소드
	public int sum() {
		int sum=price*qnt;
		return sum;
	}
	//내용 가로출력
	public void print_land() {
		System.out.printf("%s\t%s\t%d만원\t%d개\t%,d만원\n",
							code, name, price, qnt, sum());
	}
	//내용 세로 출력
	public void print_port() {
		System.out.printf("price : %d만원\n",price);
		System.out.printf("quantity : %d개\n",qnt);
		System.out.printf("total : %d만원\n",sum());
	}
}

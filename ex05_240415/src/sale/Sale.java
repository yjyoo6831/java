package sale;

public class Sale { //자바 빈 (V0)
	private int code;
	private String name;
	private int price;
	private int qnt;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	@Override
	public String toString() {
		return "Sale [code=" + code + ", name=" + name + ", price=" + price + ", qnt=" + qnt + "]";
	}
	
	
	
}

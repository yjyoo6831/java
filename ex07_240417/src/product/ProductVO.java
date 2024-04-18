package product;

import java.text.DecimalFormat;

public class ProductVO { //java bean
	private String code;
	private String name;
	private int price;
	
	public String getCode() { //외부에서 쓸수있게 하기 위해 getter setter 만듦
		return code;
	}
	public void setCode(String code) {
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
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("#,###원");
		String fmtPrice=df.format(price);
		return "ProductVO [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}

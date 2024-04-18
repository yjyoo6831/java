package sale;
import product.ProductVO; //기능별로 패키지를 나누느냐, VO,DAO 별로 나누느냐 

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*; //Date 포맷주려면 java.util 꺼를 가져와야함

public class SaleVO extends ProductVO{ //자바빈 oracle 에 있는 변수를 똑같이 써야됨
	private int seq;
	private String code;
	private String sale_date;
	private int qnt;
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("#,###");
		String fmtPrice=df.format(getPrice());
		// 수
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//String fmtDate=sdf.format(sale_date);
		int sum=getPrice()* qnt;
		String fmtSum = df.format(sum);
		return "SaleVO [seq=" + seq + ", 상품 code =" + code + ", 판매일 = " + getSale_date() + ", 판매수량=" + qnt + ", Name="
				+ getName() + ", 상품가격 Price = " + fmtPrice + ", 상품금액 = " + fmtSum;
	}
	 
	
	
	
	

}

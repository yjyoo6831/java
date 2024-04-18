package product;
//interface 는 기본 설계도

import java.util.*;
public interface ProductInter {
	public ArrayList<ProductVO> list(); //목록 출력
	public void insert(ProductVO vo);
	public boolean delete(String code);
	public void update(ProductVO vo);
	public ProductVO read(String code);
	public String getCode();
	
}

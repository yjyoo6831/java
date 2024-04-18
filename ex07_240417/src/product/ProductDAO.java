package product;

import java.sql.*;
import java.util.ArrayList;

public class ProductDAO implements ProductInter { // interface 를 구현해서 새로운 class 를 만들겠다 라는 말
	Connection con=Database.CON;
	@Override
	public ArrayList<ProductVO> list() {
		ArrayList<ProductVO> array=new ArrayList<ProductVO>();
		try {
			String sql="select * from product";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ProductVO vo=new ProductVO();
				vo.setCode(rs.getString("code"));
				vo.setName(rs.getString("name"));
				vo.setPrice(rs.getInt("price"));
				array.add(vo);
			}
		} catch (Exception e) {
			System.out.println("상품목록"+e.toString());
		}
		return array;
	}

	@Override
	public void insert(ProductVO vo) {
		// TODO Auto-generated method stub	
		try {
			String sql="insert into product(code,name,price) values (?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, vo.getCode());
			ps.setString(2, vo.getName());
			ps.setInt(3, vo.getPrice());
			ps.execute();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("상품등록 insert 에서의 error : "+e.toString());
		}
	}

	@Override
	public boolean delete(String code) {
		// TODO Auto-generated method stub
		try {
			String sql="delete from product where code=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, code);
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println("delete method 에서의 error : "+e.toString());
			return false;	
		}
	}

	@Override
	public void update(ProductVO vo) {
		try {
			String sql="update product set name=?,price=? where code=?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,vo.getName());
			ps.setInt(2,vo.getPrice());
			ps.setString(3,vo.getCode());
			ps.execute();
			
		} catch (Exception e) {
			System.out.println("상품update error : "+e.toString());
		}
		
	} //
	@Override
	public ProductVO read(String code) {
		ProductVO vo=new ProductVO();
		try {
			String sql="select * from product where code=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, code);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				vo.setCode(rs.getString("code"));
				vo.setName(rs.getString("name"));
				vo.setPrice(rs.getInt("price"));
			}
			else {
				System.out.println(code + "값이 없음");
			}
			
		} catch (Exception e) {
			System.out.println("상품 조회 : "+e.toString());
		}
		return vo;
	}
	
	public String getCode() {
		String code="";
	
		try {
			String sql="select max(code)+1 as code from product";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) code=rs.getString("code");
		} catch (Exception e) {
			System.out.println("new code: "+e.toString());
		}
			return code;
	} //getCode()
	 //
}

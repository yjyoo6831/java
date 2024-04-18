package sale;

import java.sql.*;
import java.util.*;

import product.Database;

public class SaleDAO {
	Connection con=Database.CON;
	//매출등록
	public void insert(SaleVO vo) {
		try {
			String sql="insert into sale(seq,code,sale_date,qnt,price) "
					+ "values(seq_sale.nextval,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, vo.getCode());
			ps.setString(2, vo.getSale_date());
			ps.setInt(3, vo.getQnt());
			ps.setInt(4, vo.getPrice());
			ps.execute();					
			
		} catch (Exception e) {
			System.out.println("register error "+e.toString());
			// TODO: handle exception
		}
		
	}
	
	
	
	//매출현황
	public ArrayList<SaleVO> list(){
		ArrayList<SaleVO> array=new ArrayList<SaleVO>();
		
		try {
			String sql="select sale_date, code, name, sum(qnt), sum(price*qnt) total "
					+ "from view_sale "
					+ "group by sale_date, code, name "
					+ "order by sale_date, code";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				SaleVO vo=new SaleVO();
				vo.setSale_date(rs.getString("sale_date"));
				vo.setCode(rs.getString("code"));
				vo.setName(rs.getString("name"));
				vo.setQnt(rs.getInt("sum(qnt)"));
				vo.setPrice(rs.getInt("total"));
				
				array.add(vo);
			//	System.out.println("success");
			}
					
		} catch (Exception e) {
			System.out.println("매출현황 error "+e.toString());
		}
		return array;
	} //list()
} //SaleDAO()

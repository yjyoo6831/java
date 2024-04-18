package professor;

import java.sql.*;
import java.util.*;
public class ProDAO {
	Connection con=Database.CON;
	//교수수정
	public void update(ProVO vo) {
		try {
			String sql="update professors set pname=?,dept=?,hiredate=?, title=?, salary=? where pcode=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setString(2, vo.getDept());
			ps.setString(3, vo.getHiredate());
			ps.setString(4, vo.getTitle());
			ps.setInt(5, vo.getSalary());
			ps.setString(6, vo.getPcode());
			ps.execute();
		} catch (Exception e) {
			System.out.println("!! update error !! "+e.toString());
		}
	}
	
	public void delete(String pcode) {
	try {
		String sql="delete from professors where pcode=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, pcode);
		ps.execute();
		// select 일때만 executeQuery 나머지는 그냥(up,delete,insert는  execute)
		ResultSet rs=ps.executeQuery();
	} catch (Exception e) {
		System.out.println("!!! delete error !!!"+e.toString());
	}	
	}
	//교수조회
	public ProVO read(String pcode) {
		ProVO vo=new ProVO();
		try {
			String sql="select * from professors where pcode=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, pcode);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				vo.setPcode(rs.getString("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setDept(rs.getString("dept"));
				vo.setTitle(rs.getString("title"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
			}
		} catch (Exception e) {
			System.out.println("!!!!!!!!!! error !!!!!!!!!!!"+e.toString());
		}
		return vo;
	}
	public int getCode() {
		int code=0;
		try {
			String sql="select max(pcode)+1 as code from professors";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				code=rs.getInt("code");
			}
		} catch (Exception e) {
			System.out.println("new code : "+e.toString());
		}
		return code;
	}
	
	//교수등록
	public void insert(ProVO vo) {
		try {
			String sql="insert into professors(pcode,pname,dept,hiredate,title,salary) values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
					
			ps.setString(1, vo.getPcode());
			ps.setString(2, vo.getPname());
			ps.setString(3, vo.getDept());
			ps.setString(4, vo.getHiredate());
			ps.setString(5, vo.getTitle());
			ps.setInt(6, vo.getSalary());
			ps.execute();
			System.out.println("complete");
		}catch (Exception e) {
			System.out.println("!!!!!!!!!error!!!!!!!!!"+e.toString());
		}	
	}
	
	public ArrayList<ProVO> list(){
		ArrayList<ProVO> list= new ArrayList<ProVO>();
		try {
			String sql="select * from professors order by pcode";
			
			PreparedStatement ps=con.prepareStatement(sql); //sql 문을 여기에 넣어줌
			ResultSet rs=ps.executeQuery(); //실행한 결과를 rs 에 넣어줌
			
			while(rs.next()) {
				ProVO vo=new ProVO();
				vo.setPcode(rs.getString("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setDept(rs.getString("dept"));
				vo.setTitle(rs.getString("title"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			System.out.println("교수목록 : "+e.toString());
		}
		return list;
	}
}

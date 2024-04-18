package product;

import java.sql.Connection;
//db에 접속하는 클래스
import java.sql.DriverManager;

public class Database {
	public static Connection CON;
	static {
		try {
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="product";
			String password="pass";
			Class.forName(driver);
			CON= DriverManager.getConnection(url,user,password);
			System.out.println("접속 성공!");
			
		} catch (Exception e) {
			System.out.println("접속실패 :" +e.toString());
			// TODO: handle exception
		}
	}
	
}

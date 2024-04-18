package sale;
import java.util.*;
import java.io.*;

public class SaleDAO {
	File file=new File("C:\\Users\\KOSMO\\OneDrive\\Desktop\\수업자료\\02.java\\items.txt");
	//매출삭제
	public void delete(int code) {
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line="";
			String lines="";
			while((line=br.readLine())!=null) {
				String[] items=line.split(",");
				if(code!=Integer.parseInt(items[0])) {
					lines=lines+line+'\n';
				}	
				}
			FileWriter writer=new FileWriter(file,false);
			writer.write(lines);
			writer.close();
		} catch (Exception e) {
			System.out.println("매출삭제 :"+e.toString());
		} 	
	}
	
	//매출 조회
	public Sale read(int code) {
		Sale sale=new Sale();
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			while((line=reader.readLine())!=null) {
				String[] items=line.split(",");
				if(code==Integer.parseInt(items[0])) {
					sale.setCode(code);
					sale.setName(items[1]);
					sale.setPrice(Integer.parseInt(items[2]));
					sale.setQnt(Integer.parseInt(items[3]));
				}//if
					
				} //while
			} //try 
	} //read method
	
	//매출 등록
	public void insert(Sale sale) {
		try {
			FileWriter writer=new FileWriter(file,true); //true 는 추가 , false 는 없애고 새로생성
			PrintWriter pw=new PrintWriter(writer);
			System.out.printf("%d|%s|%d|%d\n",sale.getCode(),sale.getName(),sale.getPrice(),sale.getQnt() );
			pw.printf("%d|%s|%d|%d\n",sale.getCode(),sale.getName(),sale.getPrice(),sale.getQnt() );
			pw.flush();
			pw.close();
		}
		catch(Exception e) {
			System.out.println("매출 등록 : " + e.toString()) ;
		}
	}
	public ArrayList<Sale> list(){
		ArrayList<Sale> array=new ArrayList<Sale>();
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line="";
			while((line=br.readLine())!=null) {
				String[] items=line.split("\\|");
				Sale sale=new Sale(); //sale 객체 생성
				sale.setCode(Integer.parseInt(items[0]));
				sale.setName(items[1]);
				sale.setPrice(Integer.parseInt(items[2]));
				sale.setQnt(Integer.parseInt(items[3]));
				array.add(sale);
			}
			
		}catch(NumberFormatException e) {
		}
		catch(Exception e){
			System.out.println("Error : "+e.toString());
		}
		
		return array;		
	
	} //ArrayList<Sale>
}

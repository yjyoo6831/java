package address;

import java.util.*;
import java.io.*;
public class AddressDAO { //DAO: Data Access Object
	File file=new File("C:\\data\\java\\ex05_240415\\address.txt");
	//주소등록
	public void insert(Address ad) {
		try {
			FileWriter writer=new FileWriter(file,true); //true 는 추가 , false 는 없애고 새로생성
			PrintWriter pw=new PrintWriter(writer);
			pw.printf("%s|%s|%s|%s|",ad.getNo(),ad.getName(),ad.getPhone(),ad.getAddress());
		}
		catch(Exception e){}
	}
	
	//이름 조회
	public Address read(String name) {
		Address ad1=new Address();
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			while((line=reader.readLine())!=null) {
				String[] items=line.split("|");
				if(items[1].equals(name)) {
					ad1.setNo(Integer.parseInt(items[0]));
					ad1.setName(items[1]);
					ad1.setPhone(items[2]);
					ad1.setAddress(items[3]);
				}
			}
			
			
		}catch(Exception e){
			System.out.println("이름 조회 : "+e.toString());
		}
		return ad1;
	}
	
	//주소목록
	public ArrayList<Address> list(){
		ArrayList<Address> array = new ArrayList<Address>();
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			while((line=reader.readLine())!=null) {
				
				String[] items=line.split("\\|");
				
				Address ad=new Address();
				ad.setNo(Integer.parseInt(items[0]));
				ad.setName(items[1]);
				ad.setPhone(items[2]);
				ad.setAddress(items[3]);
				
				array.add(ad);
			}
		}
		catch(NumberFormatException e) {
		}
	catch(Exception e) {
			System.out.println("주소목록 : " + e.toString());
		}
		
		
		return array; 
	}
}

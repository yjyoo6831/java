package pm;

import java.io.*;
import java.util.*;

import am.Car;

public class Sub01 {
	public static void run() {
		File file = new File("C:\\Users\\KOSMO\\OneDrive\\Desktop\\수업자료\\java\\car_list.txt");
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			
			String[] items=new String[6];
			
			while((line=reader.readLine())!=null) {
				items=line.split(",");
				Car carclass=new Car();
				carclass.setNo(Integer.parseInt(items[0]));
				carclass.setCompany(items[1]);
				carclass.setModel(items[2]);
				carclass.setColor(items[3]);
				carclass.setDistance(Integer.parseInt(items[4]));
				carclass.setDate(items[5]);
				
				//System.out.println(carclass.toString());
				System.out.println("no : "+carclass.getNo());
				System.out.println("Company : "+carclass.getCompany());
				System.out.println("Model : "+carclass.getModel());
				System.out.printf("Color : %s \ndistance : %,dkm\ndate : %s\n",carclass.getColor(),carclass.getDistance(),carclass.getDate());
				System.out.println("--------------");
				
				
			}
			
			
			
			System.out.println("read complete");
		}catch(Exception e) {
			System.out.println("Error : "+e.toString());
			System.out.println("read Fail");
		}
	}
}

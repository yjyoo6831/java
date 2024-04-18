package am;
import java.util.*;
public class Sub01 {
	public static void run() {
		ArrayList<Car> cars=new ArrayList<Car>();
		Car car=new Car();
		car = new Car(1,"Tesla","model3","white",100000,"2024-01");		
		cars.add(car);
		car = new Car(2,"Tesla","model4","black",10000,"2024-02");		
		cars.add(car);
		car = new Car(3,"Tesla","model5","rainbow",1000,"2024-03");		
		cars.add(car);
		
		Scanner scan=new Scanner(System.in);
		
		boolean run=true;	
		while(run) {
	         System.out.println("--------------------------------------------");
	         System.out.println("1.차량등록|2.차량조회|3.차량목록|4.차량삭제|0.종료");
	         System.out.println("--------------------------------------------");
	         System.out.print("선택>");
	         String menu=scan.nextLine();
			switch(menu) {
				case "1": //등록
					Car car1=new Car();
					System.out.print("제조사 : ");
					String com=scan.nextLine();
					car1.setCompany(com);
					System.out.print("모델 : ");
					String md=scan.nextLine();
					car1.setModel(md);
					System.out.print("색상 : ");
					String cl=scan.nextLine();
					car1.setColor(cl);
					System.out.print("키로수 : ");
					int km=Integer.parseInt(scan.nextLine());
					car1.setDistance(km);
					
					System.out.print("날짜 : ");
					String date=scan.nextLine();
					car1.setDate(date);
					
					
					//int noidx = cars.size()-1;
					Car noidx=cars.get(cars.size()-1);
					System.out.println(cars);
					//System.exit(0);
					//int num=cars.get(noidx);
					int num=noidx.getNo()+1;
					car1.setNo(num);
					
					cars.add(car1);
					
					//num++;
					System.out.println("제품번호 : " + num + " " + com + " " + md + " 등.완.!");
					
					break;
					
				case "2": //차 별 조회
					while(true) {
						System.out.print("조희할 차량 모델:");
						String sname=scan.nextLine();
						boolean find=false;
						for (Car j:cars) {
							if(sname.equals(j.getModel())) {
								System.out.println(car.toString());
								find=true;
							} //if
						} //for
						if(!find) {
							System.out.println(sname+"은 등록되지 않은 차량.");
							break;
						}
					}//while
					break;
				case "3": //목록
					for (Car j:cars) {
						System.out.printf("%s\t%s\t%s\t%s\t%,dkm\t%s\n",j.getNo(),j.getCompany(),j.getModel(),j.getColor(),j.getDistance(),j.getDate());	}//for
					break;
				case "4":
					System.out.print("삭제할 차량:");
					String rname=scan.nextLine();
					rname=scan.nextLine();
					boolean find=false;
					
					for (Car j:cars) {
						if(rname.equals(j.getModel())) { //if2
							System.out.println("제조사 : "+j.getCompany());
							System.out.println("모델 : "+j.getModel());
							find=true;
						
							System.out.print("삭제하십니까?(y/n)");
							String ans=scan.nextLine();
							if(ans.equals("Y")||ans.equals("y")) { //if1
								cars.remove(j);
								System.out.println("삭제완료.\n현재 남아있는 차량 >>>>>");
								System.out.printf("%s\t%s\t%s\t%,dkm\t%s\n",j.getCompany(),j.getModel(),j.getColor(),j.getDistance(),j.getDate());
								
								break;
							} //if1
							else {
								System.out.println("삭제취소");
								find=false;
							}
						} //if2
						if(!find) {
							System.out.println(rname+"은 등록되지 않은 차임.");
					} 
					
					} //for
					break;
				case "0":
					System.out.println("프로그램을 종료합니다.");
					run=false;
					break;
				default:
					System.out.println("0~4메뉴를 선택하세요!");
				
 
					//System.out.println("등록된 차량: "+cars.size());

	         }//switch
		} //while
	}//run()
} //class

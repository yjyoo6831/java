package am;

import java.util.ArrayList;

public class Sub02 {
	public static void run() {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("1","예지","부산","123-8282"));
		students.add(new Student("2","예삐","설","111-8181"));
		students.add(new Student("3","삐삐","대전","000-1234"));
		
		for(Student s:students) {
			s.print();
		}
		System.out.println();
		for(int i=0;i<students.size();i++) {
			Student s=students.get(i);
			s.print();
		}
		
		
		
	}
}

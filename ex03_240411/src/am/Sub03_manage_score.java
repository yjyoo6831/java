package am;
import java.util.*;

public class Sub03_manage_score {
	public static void run() {
	ArrayList<Score> scores=new ArrayList<>();
	Score s1=new Score("yejin",90,90,90);
	Score s2=new Score("minji",95,95,95);
	Score s3=new Score("quoka",90,90,90);
	
	scores.add(s1);
	scores.add(s2);
	scores.add(s3);
	
	for(Score s:scores) {
		s.print();
	}
	
	
	}
}

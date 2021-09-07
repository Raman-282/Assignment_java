package constructors;

public class Grader {
	String score;
	int percentage;
	Grader(String name,int dbms,int os,int cn,int java,int python){
		int addition;
		addition=dbms+os+cn+java+python;
		percentage=(addition*100)/500;
		System.out.println("name -"+name+ "\npercentage -"+percentage);
		}
	void letterGrade() {
		if(percentage>0 && percentage <100) {
			if(percentage>80) {
				score="Grade A";
				System.out.println(score);
			}
			else if(percentage>70 && percentage<=80) {
				score="Grade B";
				System.out.println(score);
			}
			else if(percentage>60 && percentage<=70) {
				score="Grade c";
				System.out.println(score);
			}
			else if(percentage>50 && percentage<=70) {
				score="Grade D";
				System.out.println(score);
			}
			else if(percentage>40 && percentage<=50) {
				score="Grade E";
				System.out.println(score);
			}
			else if(percentage>30 && percentage<=40) {
				score="Grade E";
				System.out.println(score);
			}
			else {
				System.out.println("Fail - Grade F");
			}
			System.out.println();
		}
	}
}



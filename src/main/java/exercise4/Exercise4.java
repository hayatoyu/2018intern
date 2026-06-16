package exercise4;

import lombok.Getter;
import lombok.Setter;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();
		a.name = "靜香";
		a.score = 83;
		Student b = new Student("出木杉", 90);
		Student c = new Student("胖虎", 68);
		Student d = new Student("葉大雄", 17);
		
		getGrade(a);
		getGrade(b);
		getGrade(c);
		getGrade(d);
		
		changeName(a, "小夫");
		addScore(c, 10);
		
		Student2 e = new Student2();
		e.name = "世修";
		e.score = 99;
		System.out.println(e.name + " 的成績為 " + e.getGrade());
	}
	
	public static void getGrade(Student s) {
		if(s.score >= 90) {
			System.out.println(s.name + " 的成績為 A");
		} else if (s.score >= 80) {
			System.out.println(s.name + " 的成績為 B");
		} else if (s.score >= 70) {
			System.out.println(s.name + " 的成績為 C");
		} else if (s.score >= 60) {
			System.out.println(s.name + " 的成績為 D");
		} else {
			System.out.println(s.name + " 的成績為 E");
		}
	}
	
	public static void changeName(Student s, String name) {
		String oldName = s.name;
		System.out.println(oldName + " 將被改名成 " + name);
		s.name = name;
		System.out.println(oldName + " 現在叫 " + s.name);
	}
	
	public static void addScore(Student s, int score) {
		int oldScore = s.score;
		System.out.println(s.name + " 的分數目前為 " + s.score + ", 應加 " + score + " 分");
		s.score = oldScore + score;
		System.out.println(s.name + " 的分數由 " + oldScore + " 提高至 " + s.score + "分");
	}

	public static class Student {
		
		@Getter @Setter
		private String name;
		
		@Getter @Setter
		private int score;
		
		public Student() {}
		
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}
	
	public static class Student2 {
		
		@Getter @Setter
		private String name;
		
		@Getter @Setter
		private int score;
		
		public String getGrade() {
			if(score >= 90) {
				return "A";
			} else if (score >= 80) {
				return "B";
			} else if (score >= 70) {
				return "C";
			} else if (score >= 60) {
				return "D";
			} else {
				return "E";
			}
		}
	}
}


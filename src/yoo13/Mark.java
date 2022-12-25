package yoo13;

import java.util.Scanner;

public class Mark {
		private String type;
		private Integer Grade;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Integer getGrade() {
			return Grade;
		}
		public void setGrade(Integer grade) {
			Grade = grade;
		}
		
		Mark(){
			Scanner sc = new Scanner(System.in);

			System.out.println("Pleas enter the Grade:  ");
			int Grade = sc.nextInt();
			setGrade(Grade);
			System.out.println("Pleas enter the Grade type:  ");
			String type=sc.next();
			setType(type);
		}
}

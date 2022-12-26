package yoo13;

import java.util.Scanner;
import java.util.Stack;

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
			Stack<String> stack = new Stack<String>(); 

			Scanner sc = new Scanner(System.in);

			System.out.println("Pleas enter the Grade:  ");
			int Grade = sc.nextInt();
			setGrade(Grade);
			String grade=Integer.toString(Grade);
			stack.push(grade);
			System.out.println("Pleas enter the Grade type:  ");
			String type=sc.next();
			setType(type);
			stack.push(type);
		}
}

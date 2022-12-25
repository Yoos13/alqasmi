package yoo13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;
import javax.swing.plaf.synth.SynthButtonUI;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean z = true;
		Scanner sc = new Scanner(System.in);
		List<Department> DepObj = new ArrayList<Department>();

//     List<String> list = new ArrayList<String>();

		 while(z) {
			System.out.println("Welcome to our Site");
			System.out.println("\n\n");
			System.out.println("pleas enter 1 to Creat OC");
			System.out.println("pleas enter 2 to select School");
			System.out.println("pleas enter 3 to select Department");
			System.out.println("pleas enter 4 to select Teacher");
			System.out.println("pleas enter 5 to select Student");
			System.out.println("pleas enter 6 to select Cours");
			System.out.println("pleas enter 7 to select Mark");

			
			
			
			int input=sc.nextInt();
			
			if(input==1) {
				School SchoolObj = new School();
				System.out.println("pleas enter the school Name: ");
				SchoolObj.setName(sc.next());
				System.out.println("pleas enter the Location: ");
				SchoolObj.setLocation(sc.next());
				boolean i=true;
				boolean k=true;
				boolean S=true;
				boolean c=true;
				boolean m=true;
				                                                                      
				while(i){
				
				Department dep = new Department();
//				System.out.println("pleas enter the Name Of Department:  ");
//				String Name = sc.next();
//				dep.setName(Name);
				k=true;
				
				
				while(k) {
				Teacher tech=new Teacher();
//				System.out.println("pleas enter the Name Of Techer:  ");
//				String Name1 = sc.next();
//			    tech.setName(Name1);
			    S=true;
			    while(S) {
			    	
			    Student stu1=new Student();
				System.out.println("pleas enter the Name Of Student:  ");
				String StuName = sc.next();
				stu1.setName(StuName);
					c=true;
				while(c) {
					Cours cou1 = new Cours();
//					System.out.println("Pleas enter the Cours Name: ");
//					String type=sc.next();
//					cou1.setType(type);
//					System.out.println("Pleas enter the Cours Id: ");
//					Integer Id = sc.nextInt();
//					cou1.setId(Id);
					m=true;
				
				while(m) {
					
				Mark Mrk11 = new Mark();
//				System.out.println("Pleas enter the Grade:  ");
//				int Grade = sc.nextInt();
//				Mrk11.setGrade(Grade);
//				System.out.println("Pleas enter the Grade:  ");
//				String type=sc.next();
//				Mrk11.setType(type);
				System.out.println("Do you want add more Grade press yes/no?");
				String key4=sc.next();
				cou1.Mrk.add(Mrk11);
			    if(key4.equals("yes")) {
			    	m=true;
			    	
			 
			    }
			    else if(key4.equals("no")) {
			    	
			 			  
					  m=false;  	
					    	
			     }
				    
				    }
			    
			    
			
				System.out.println("Do you want add Cours ID press yes/no?");
				String key3=sc.next();
				stu1.Cou.add(cou1);
				if(key3.equals("yes")) {
					c=true;
				}
				else if (key3.equals("no")){
					c=false;
				}
			    
			    }
				
			    System.out.println("Do you want add Student press yes/no?");
				String key2=sc.next();
				tech.stu.add(stu1);
			    if(key2.equals("yes")) {
			    	S=true;
			    }
			    else if(key2.equals("no")){
			    	S=false;
			    }
			    
			    }
			    System.out.println("Do you want add teacher press yes/no?");
				String key1=sc.next();
				dep.TecherObj1.add(tech);
			    
				if(key1.equals("yes")) {
					k=true;
				}
				else if(key1.equals("no")) {
					k=false;
				}
				}
				DepObj.add(dep);
				System.out.println("Do you want more department press yes/no/other to Exit?");
				String key=sc.next();
				
				
				if(key.equals("yes")) {
				
                i = true;
                
              
		    	   
				}
				else if (key.equals("other")) {
					System.out.println("pleas enter Exit to go to the Munu");
			    	String key5=sc.next();
			    	   if(key5.equals("Exit")) {
			    		   i=false;
			    		   m=false;
			    		   c=false;
			    		   S=false;
			    		   k=false;
			    		    z=true;
	                   
	                   

			    	   }
			    	   else if(key5.equals("con")) {
			    		   i=false;
			    	   }
				}
				
				else if(key.equals("no")) {
					
					 
					
				    	   
					
			    	    System.out.println("Thanxs");
			    	    System.out.println();
						System.out.println("<<<<<<<<<< This is the Final Informatin >>>>>>>>>>");
			    	    System.out.println();
						System.out.println("School name " + SchoolObj.name );
						
						
						for (Department d : DepObj) {
							
							System.out.println("Department Name:" + d.getName() );
							for(Teacher T:d.TecherObj1) {
								 System.out.println("Teacher Name:" + T.getName() );
								 for(Student s :T.stu) {
								 System.out.println("Student Name :" + s.getName() );
								 for(Cours C: s.Cou) {
								 System.out.println("Course Id :" + C.getId() );
								 for(Mark M:C.Mrk) {
									 System.out.println("Mark Grade :" + M.getGrade() );
							    	    System.out.println("<<<<<<<<<< Good Bye >>>>>>>>>>");

								 }
								 
								 }
								 }
							}
							}
					i=false;
//					//z=false;
				}
				
				 
						
//					System.out.println("==========================================");
//					System.out.println("School Name: " + SchoolObj.getName());
//					System.out.println("Department Name: " + DepObj.getName());
//					System.out.println("Teacher Name: " + TecherObj.getName());
//					System.out.println("Student Name: " + StudentObj.getName());
//					System.out.println("Cours Name: " + coursObj.getId());
//					System.out.println("Mark Grade: " + MarkObj.getGrade());
				//}
					//i=false;
				}
				
			}
			
		 
			else if(input==2) {
			
		
		School SchoolObj = new School();
		System.out.println("pleas enter the school Name: ");
		String name = sc.next();
		SchoolObj.setName(name);
		System.out.println("\n\n");

		System.out.println("==========================================");
		System.out.println("School Name: " + SchoolObj.getName());
			}
			else if(input==3) {

		Department dep = new Department();
		System.out.println("pleas enter the Name Of Department:  ");
		String Name = sc.next();
		dep.setName(Name);
		System.out.println("Department Name: " + dep.getName());
		
		
			}
			else if(input==4){
			
		Teacher TecherObj = new Teacher();
		System.out.println("pleas enter the Name Of Techer:  ");
		String Name1 = sc.next();
		TecherObj.setName(Name1);
		System.out.println("Teacher Name: " + TecherObj.getName());

		 }
			else if(input==5) {
				Student StudentObj = new Student();
				System.out.println("pleas enter the Name Of Student:  ");
				String StuName = sc.next();
				StudentObj.setName(StuName);
				System.out.println("Student Name: " + StudentObj.getName());

			}

			else if(input==6) {
				Cours coursObj = new Cours();
				System.out.println("Pleas enter the Cours Id: ");
				Integer Id = sc.nextInt();
				coursObj.setId(Id);
			}
			else if(input==7) {
				Mark MarkObj = new Mark();
				System.out.println("Pleas enter the Grade:  ");
				Integer Grade = sc.nextInt();
				MarkObj.setGrade(Grade);
			}
			else {
				z=false;
				System.out.println("Good Bye");
			}
			
	}
	}

}

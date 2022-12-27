package yoo13;

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;
import javax.swing.plaf.synth.SynthButtonUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class Menu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean z = true;
		Scanner sc = new Scanner(System.in);
		List<Department> DepObj = new ArrayList<Department>();
		Stack<String> stack = new Stack<String>();

		System.out.println("Welcome to our Site");
		// Create while loop for the Menu
		while (z) {

			System.out.println("\n\n");
			System.out.println("pleas enter 1 to Creat OC");
			System.out.println("pleas enter 2 to select School");
			System.out.println("pleas enter 3 to select Department");
			System.out.println("pleas enter 4 to select Teacher");
			System.out.println("pleas enter 5 to select Student");
			System.out.println("pleas enter 6 to select Cours");
			System.out.println("pleas enter 7 to select Mark");
			System.out.println("pleas enter 8 to print History");
			System.out.println("pleas enter 9 to Read from file");

			
			boolean i = true;
			boolean k = true;
			boolean S = true;
			boolean c = true;
			boolean m = true;

			int input = sc.nextInt();
			// if condition for the first option in the menu
			if (input == 1) {
				School SchoolObj = new School();
				System.out.println("pleas enter the school Name: ");
				String Name = sc.next();
				SchoolObj.setName(Name);
				stack.push(Name);
				System.out.println("pleas enter the Location: ");
				// SchoolObj.setLocation(sc.next());
				String Loc = sc.next();
				stack.push(Loc);

				// Create loop for Department in case for add more dep
				while (i) {

					Department dep = new Department();
					System.out.println("pleas enter the Name Of Department:  ");
					String Name1 = sc.next();
					stack.push(Name1);
					dep.setName(Name1);
					k = true;

					while (k) {

						Teacher tech = new Teacher();
						System.out.println("pleas enter the Name Of Techer:  ");
						String Name2 = sc.next();
						stack.push(Name2);
						tech.setName(Name2);
						S = true;
						while (S) {

							Student stu1 = new Student();
							System.out.println("pleas enter the Name Of Student:  ");
							String StuName = sc.next();
							stack.push(StuName);
							stu1.setName(StuName);
							System.out.println("pleas enter the ID Of Student:  ");
							int id = sc.nextInt();
							String id1 = Integer.toString(id);
							stack.push(id1);
							stu1.setId(id);
							c = true;
							while (c) {
								Cours cou1 = new Cours();
								System.out.println("Pleas enter the Cours Name: ");
								String type = sc.next();
								cou1.setType(type);
								stack.push(type);
								System.out.println("Pleas enter the Cours Id: ");
								Integer Id = sc.nextInt();
								cou1.setId(Id);
								String id2 = Integer.toString(Id);
								stack.push(id2);
								m = true;

								while (m) {

									Mark Mrk11 = new Mark();
									System.out.println("Pleas enter the Grade:  ");
									int Grade = sc.nextInt();
									Mrk11.setGrade(Grade);
									String grade = Integer.toString(Grade);
									stack.push(grade);
									System.out.println("Pleas enter the Grade type:  ");
									String type1 = sc.next();
									Mrk11.setType(type1);
									stack.push(type1);
									System.out.println("Do you want add more Grade press yes/no?");
									String key4 = sc.next();
									cou1.Mrk.add(Mrk11);
									if (key4.equals("yes")) {
										m = true;

									} else if (key4.equals("no")) {

										m = false;

									}

								}

								System.out.println("Do you want add Cours ID press yes/no?");
								String key3 = sc.next();
								stu1.Cou.add(cou1);
								if (key3.equals("yes")) {
									c = true;
								} else if (key3.equals("no")) {
									c = false;
								}

							}

							System.out.println("Do you want add Student press yes/no?");
							String key2 = sc.next();
							tech.stu.add(stu1);
							if (key2.equals("yes")) {
								S = true;
							} else if (key2.equals("no")) {
								S = false;
							}

						}
						System.out.println("Do you want add teacher press yes/no?");
						String key1 = sc.next();
						dep.TecherObj1.add(tech);

						if (key1.equals("yes")) {
							k = true;
						} else if (key1.equals("no")) {
							k = false;
						}
					}
					DepObj.add(dep);
					System.out.println("Do you want more department press yes/no/other to Exit?");
					String key = sc.next();

					if (key.equals("yes")) {

						i = true;

					} else if (key.equals("other")) {
						System.out.println("pleas enter Exit to go to the Munu");
						String key5 = sc.next();
						if (key5.equals("Exit")) {
							i = false;
							m = false;
							c = false;
							S = false;
							k = false;
							z = true;

						} else if (key5.equals("con")) {
							i = false;
						}
					}
					// printing section
					else if (key.equals("no")) {
						FileWriter myWriter = new FileWriter("History.txt");
						myWriter.write("Thanxs");
						myWriter.write("\n");
						myWriter.write("<<<<<<<<<< This is the Final Informatin >>>>>>>>>>");
						myWriter.write("\n");
						myWriter.write("School name " + SchoolObj.name);
						myWriter.write("\n");


						for (Department d : DepObj) {

//							System.out.println("Department Name:" + d.getName());
							myWriter.write("Department Name:" + d.getName());
							myWriter.write("\n");
							for (Teacher T : d.TecherObj1) {
								myWriter.write("Teacher Name:" + T.getName());
								myWriter.write("\n");
								for (Student s : T.stu) {
									myWriter.write("Student Name :" + s.getName());
									myWriter.write("\n");
									for (Cours C : s.Cou) {
										myWriter.write("Course Id :" + C.getId());
										myWriter.write("\n");
										for (Mark M : C.Mrk) {
											myWriter.write("Mark Grade :" + M.getGrade());
											myWriter.write("\n");
											myWriter.write("<<<<<<<<<< Good Bye >>>>>>>>>>");
											myWriter.write("\n");

										}

									}
								}
							}
						}
						myWriter.close();
						i = false;
//					
					}

//					
				}

			}

			else if (input == 2) {

				School SchoolObj = new School();
				System.out.println("pleas enter the school Name: ");
				String name = sc.next();
				SchoolObj.setName(name);
				System.out.println("\n\n");

				System.out.println("==========================================");
				System.out.println("School Name: " + SchoolObj.getName());
			} else if (input == 3) {

				Department dep = new Department();
				System.out.println("pleas enter the Name Of Department:  ");
				String Name = sc.next();
				dep.setName(Name);
				System.out.println("Department Name: " + dep.getName());

			} else if (input == 4) {

				Teacher TecherObj = new Teacher();
				System.out.println("pleas enter the Name Of Techer:  ");
				String Name1 = sc.next();
				TecherObj.setName(Name1);
				System.out.println("Teacher Name: " + TecherObj.getName());

			} else if (input == 5) {
				Student StudentObj = new Student();
				System.out.println("pleas enter the Name Of Student:  ");
				String StuName = sc.next();
				StudentObj.setName(StuName);
				System.out.println("Student Name: " + StudentObj.getName());

			}

			else if (input == 6) {
				Cours coursObj = new Cours();
				System.out.println("Pleas enter the Cours Id: ");
				Integer Id = sc.nextInt();
				coursObj.setId(Id);
			} else if (input == 7) {
				Mark MarkObj = new Mark();
				System.out.println("Pleas enter the Grade:  ");
				Integer Grade = sc.nextInt();
				MarkObj.setGrade(Grade);

			} else if (input == 8) {

				for (String Stk : stack) {
					System.out.println(Stk);
				}
//				try {
//				      FileWriter myWriter = new FileWriter("History.txt");
//				      myWriter.write("This is History");
//				      for(String Fri:stack) {
//				    	  myWriter.write("\n"+Fri);
//				      }
//				      myWriter.close();
//				}catch (IOException e) {
//					 e.printStackTrace();
//					
//				}

			}else if(input==9) {
				try {
				  File myObj = new File("Moha.txt");
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
//					
//						
//				
			} else {
				z = false;
				System.out.println("Good Bye");
			}

		}
	}

}

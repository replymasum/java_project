    
import java.util.*;
	import java.io.*;

	public class Admin {
		public static LinkedList<Student> studentList = new LinkedList<Student>();
		public static LinkedList<Teacher> teacherList = new LinkedList<Teacher>();
		static Scanner input = new Scanner(System.in);

		static void addEdit(){
			input.nextLine();
			
			System.out.println("***Please Enter your choice***");
			
			System.out.println("1)Add Student ");
			System.out.println("2)Add Teacher ");
			System.out.println("3)Edit Student's Details ");
			System.out.println("4)Edit Teacher's Details  ");
			System.out.println("5)Show students list   ");
			System.out.println("6)Show Teacher list   ");
			System.out.println("7)Delete Student ");
			System.out.println("8)Delete Teacher ");
			System.out.println("9)Logout ");
			
			
			
			/*
			System.out.println("1)Add Student 2)Add Teacher 3)Edit Student's Details 4)Edit Teacher's Details "
					+"5)Show students list 6)Show Teacher list 7)Delete Student 8)Delete Teacher 9)Logout");	*/
			try {
				System.out.print("Your choice : ");
				int choice = input.nextInt();
				switch(choice) {
				case 1: addStudent(); break;
				case 2: addTeacher(); break;
				case 3: editStudent(); break;
				case 4: editTeacher();break;
				case 5: showStudent(); break;
				case 6: showTeacher(); break;
				case 7: deleteStudent(); break;
				case 8: deleteTeacher(); break;
				case 9: logout(); break;

				default: 
					System.out.println("Invalide Choice!!\n");
					addEdit();
				}
			} catch(Exception e){
				System.out.println("Invalide Choice!!");
				System.out.println("Exception : "+e+"\n");
				addEdit();
			}
		}

		static void addStudent() {
			String id,name,dept,session,floor,roomno,roomCapacity,address,contact;;
			System.out.print("ID : "); id = input.next();
			System.out.println("Name : "); name = input.next();
			System.out.println("Dept : "); dept = input.next();
			System.out.println("Session : "); session = input.next();
			System.out.println("Floor : "); floor = input.next();
			System.out.println("Room No : "); roomno = input.next();
			System.out.println("Room Capacity : "); roomCapacity = input.next();
			System.out.println("Address : "); address = input.next();
			System.out.println("Contact : "); contact = input.next();
			studentList.add(new Student(id,name,dept,session,floor,roomno,roomCapacity,address,contact));
			System.out.println();
			System.out.println("Student has been Added Successfully!!\n");
			System.out.println("Add more student? 1)Yes 2)No");
			System.out.print("Your input : ");
			int choice = input.nextInt();
			if(choice == 1) {
				addStudent();
			}
			else {
				addEdit();
			}
		}

		static void addTeacher() {
			String id,name,dept,email,contact,hostelname;
			System.out.print("ID : "); id = input.next();
			System.out.print("Name : "); name = input.next();
			System.out.print("Dept : "); dept = input.next();
			System.out.print("Email : "); email = input.next();
			System.out.print("Contact : "); contact = input.next();
			System.out.print("Provost of Hostel: "); hostelname = input.next();
			teacherList.add(new Teacher(id,name,dept,email,contact,hostelname));
			System.out.println("Teacher has been Added Successfully!!\n");
			System.out.println("Add more teacher? 1)Yes 2)No");
			System.out.print("Your input : ");
			int choice = input.nextInt();
			if(choice == 1) {
				addTeacher();
			} else {
				addEdit();
			}
		}

		static void editStudent() {
			System.out.print("Enter the ID to edit: ");
			String searchId = input.next();
			for(Student d: studentList) {
				if(searchId.equals(d.id)) {
					int index = studentList.indexOf(d);
					String id,name,dept,session,floor,roomno,roomCapacity,address,contact;;
					System.out.print("New ID:"); id = input.next();
					System.out.print("New Name:"); name = input.next();
					System.out.print("New Dept:"); dept = input.next();
					System.out.print("New Session:"); session = input.next();
					System.out.print("NEW Floor:"); floor = input.next();
					System.out.print("New Room No:"); roomno = input.next();
					System.out.print("New Room Capacity:"); roomCapacity = input.next();
					System.out.print("NEW Address:"); address = input.next();
					System.out.print("NEW Contact:"); contact = input.next();
					studentList.remove(d);
					studentList.add(index,new Student(id,name,dept,session,floor,roomno,roomCapacity,address,contact));
					break;
				}
			}
			System.out.println("Student has been Edited Successfully!!\n");
			addEdit();
		}

		static void editTeacher() {
			System.out.print("Enter the ID to edit: ");
			String searchId = input.next();
			for(Teacher p: teacherList) {
				if(searchId.equals(p.id)) {
					int index = teacherList.indexOf(p);
					String id,name,dept,email,contact,hostelname;;
					System.out.print("New ID : "); id = input.next();
					System.out.print("New Name : "); name = input.next();
					System.out.print("New Dept : "); dept = input.next();
					System.out.print("NEW Email : "); email = input.next();
					System.out.print("NEW Contact : "); contact = input.next();
					System.out.print("New Hostel Name : "); hostelname= input.next();
					teacherList.remove(p);
					teacherList.add(index,new Teacher(id,name,dept,email,contact,hostelname));
					break;
				}
			}
			System.out.println("Teacher has been Edited Successfully!!\n");
			addEdit();
		}

		static void showStudent() {
			System.out.println("<<<***Total Student List***>>>");	
			for(Student d : studentList) { 
				System.out.println(d);
			}
			addEdit();
		}

		static void showTeacher() {
			System.out.println("<<<***Total Teacher List***>>>");	
			for(Teacher p : teacherList) {
				System.out.println(p);
			}
			addEdit();
		}
		
		static void deleteStudent() {
			System.out.print("Enter the ID to delete: ");
			String searchId = input.next();
			for(Student d: studentList) {
				if(searchId.equals(d.id)) {
					studentList.remove(d);
					break;
				}
			}
			System.out.println("Student deleted successfully!!");
			addEdit();
		}
		
		static void deleteTeacher() {

			System.out.print("Enter the ID to delete: ");
			String searchId = input.next();
			for(Teacher p: teacherList) {
				if(searchId.equals(p.id)) {
					teacherList.remove(p);
					break;
				}
			}
			System.out.println("Teacher deleted successfully!!");
			addEdit();
		}
		
		static void logout() {
			Generator generator = new Generator();
			generator.mainFunction();
		}
		

	}



import java.util.Scanner;
public class Employee {

	public String name;
	public int year;
	public int salary;
	public String address;
			
	Scanner scan = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
			
	void input(){
		System.out.print("Enter name : ");
		name = scan.nextLine();
		System.out.print("Enter the year of joining : ");
		year = scan.nextInt();
		System.out.print("Enter the salary : ");
		salary =  scan.nextInt();
		System.out.print("Enter the address  : ");
		address = input.nextLine();
	}
			
	void print(){
				System.out.print(name+"\t\t");
				System.out.print(year+"\t     ");
				System.out.print(salary+"\t    ");
				System.out.println(address);
			}

			
public static void main(String[] args) {
				
				Employee person1 = new Employee();
				Employee person2 = new Employee();
				Employee person3 = new Employee();
				
				person1.input();
				person2.input();
				person3.input();
				
 System.out.println("\nName \t Year of joining    Salary \t Address\n");
				person1.print();
				person2.print();
				person3.print();
					
			}
		}












import java.util.Scanner;

import hostel.feeCollection.*;

public class Test {

	public static void main(String[] args) {
	System.out.println("HOSTEL MANAGEMENT SYSTEM");
	Scanner sc = new Scanner(System.in);
	
	hostel.feeCollection f = new hostel.feeCollection();
	mainHostel.Maintenance m = new mainHostel.Maintenance();
	roomDetails.room r = new Room();
	Storage.Inventory i = new Inventory();
	String chr="y";
	while(chr.equals("y")) {
	System.out.println("Enter the option :\n1.Student Details\n2.Hostel Details\n3.Display Details");
	int choice = sc.nextInt();
	switch(choice) {
	case 1:System.out.println("Enter Register Number");
			String regNo = sc.next();
			f.setRegNo(regNo);
			System.out.println("Enter the choice :\n1.Room Details\n2.Fees Details");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter Hostel Name");
					String hostel = sc.next();
					r.setHostels(hostel);
					System.out.println("Enter Room number");
					int roomno = sc.nextInt();
					r.setRoomNo(roomno);
					System.out.println("Enter Room Type");
					String roomt = sc.next();
					r.setRoomType(roomt);
					break;
			case 2: if(r.getRoomType().equals("Singleseater"))
					f.setRoomfees(5000);
					else if(r.getRoomType().equals("fourSeater")) {
						f.setRoomfees(3000);
					}
					else {
						f.setRoomfees(1000);
					}
					System.out.println("Enter Mess Fees");
					double mess = sc.nextDouble();
					f.setMessfess(mess);
					System.out.println("Enter Food Coupons");
					float coupons = sc.nextFloat();
					f.setCoupons(coupons);
					f.computeFees(); break;
			}break;
	case 2: System.out.println("Enter Hostel Name");
			String hostel = sc.next();
			if(r.getHostels().equals(hostel)){
				i.setBeds(500);
				i.setDesks(600);
				i.setComputers(200);
				i.setRegister(10);
				i.setSportGoods(100);
				m.setDamagedGoods(250);
				m.setComplaintAttended(100);
				m.setRoomcleaning(80);
			}else {
				System.out.println("No such hostel exists");
			}break;
	case 3: System.out.println("Enter your choice: \n1.Student details \n2.Hostel details");
			int c = sc.nextInt();
			switch(c){
				case 1: System.out.println("*************Student Details**************");
						System.out.println("Register no :"+f.getRegNo()
						+"\nHostel Name: "+r.getHostels()+"\nRoom No: "+
						r.getRoomNo()+"\nRoom Type: "+r.getRoomType()+
						"\nRoom Fees: "+f.getRoomfees()+"\nMess Fees: "+f.getMessfess()
						+"\nFood coupons: "+f.getCoupons()+"\nTotal Fees: "+f.getFees());
						break;
				case 2: System.out.println("**************** Hostel Details**************");
						System.out.println("Hostel Name: "+r.getHostels()+"\nBeds: "+i.getBeds()
						+"\nComputers: "+i.getComputers()+"\nDesks: "+i.getDesks()
						+"\nRegisters: "+i.getRegisters()+"\nSportGoods: "+i.getSportgoods()
						+"\nDamaged Goods: "+m.getDamagedGoods()+"\nComplaints Attended: "+
						m.getComplaintAttended()+"\nRooms Cleaned: "+m.getRoomcleaning());
						break;
			}break;
	}
	System.out.println("Do you want to continue?(y/n): ");
	chr = sc.next();
			}
		}
}
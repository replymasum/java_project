
public class Student   {
	String id,name,dept,session,floor,roomno,roomCapacity,address,contact;
	
	 Student(String id, String name,String dept ,String session,String floor ,String roomno,String roomCapacity,String address,String contact){
		this.id = id;
		this.name = name;
		this.dept=dept;
		this.session=session;
		this.floor=floor;
		this.roomno=roomno;
		this.roomCapacity=roomCapacity;
		this.address=address;
		this.contact=contact;
		
		
		
		
 	}
	public String toString(){
		return "ID "+ id +"\tName :\t" +name +"\tDept :\t" +dept+"\tSession :\t" +session +"\tFloor:"+floor+"\tRoom No:\t"+roomno+"\tRoom Capacity :\t" +roomCapacity+"\tAddress :\t" +address  +"\tContact :\t"+contact;
	}
}





public class Teacher {
	
		String id,name,dept,email,contact,hostelname;
		
		Teacher(String id, String name,String dept,String email, String contact,String hostelname){
			this.id = id;
			this.name = name;
			this.dept = dept;
			this.email=email;
			this.contact=contact;
			this.hostelname=hostelname;
	 	}
	public String toString(){
			
			return "ID : "+ id +"\tName : \t" +name+" \tDept : \t" +dept+" \tEmail : \t" +email +"\tContact : \t" +contact +"\tHostel Name : \t" +hostelname;
		}

	}



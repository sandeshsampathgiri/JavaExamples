package Assignment2;

public class Student {
	
	String name;
	int roll_no;
	long phone_no;
	String address;

	public Student(String name, int roll_no, long phone_no, String address) {

		this.name=name;
		this.roll_no=roll_no;
		this.phone_no=phone_no;
		this.address=address;
	}
	
	public Student()
	{
		
	}


	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="John";
		s1.roll_no=2;
		s1.phone_no=123;
	//	s1.address="456 Little Street";
		
		Student s2=new Student("Sam",3,26630171,"123 Main Street");
		
		System.out.println(s1.name+"'s details are:");
		System.out.println("Name: "+s1.name);
		System.out.println("Roll No: "+s1.roll_no);
		System.out.println("Phone No: "+s1.phone_no);
		System.out.println("Address: "+s1.address);
		System.out.println("******************************************");
		
		System.out.println(s2.name+"'s details are:");
		System.out.println("Name: "+s2.name);
		System.out.println("Roll No: "+s2.roll_no);
		System.out.println("Phone No: "+s2.phone_no);
		System.out.println("Address: "+s2.address);
		System.out.println("******************************************");

	}

}

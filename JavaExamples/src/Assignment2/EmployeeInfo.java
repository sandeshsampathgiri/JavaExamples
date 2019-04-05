package Assignment2;

public class EmployeeInfo {

	String employeeName;
	int joiningYear;
	String empAddress;
		
	public EmployeeInfo(String employeeName, int joiningYear, String empAddress) {
		
		this.employeeName=employeeName;
		this.joiningYear=joiningYear;
		this.empAddress=empAddress;
		
	}

	public static void main(String[] args) {
		
		EmployeeInfo e1=new EmployeeInfo("Robert",1994,"123 Main Street");
		EmployeeInfo e2=new EmployeeInfo("Sam",2000,"68D Wall Street");
		EmployeeInfo e3=new EmployeeInfo("John",1999, "26B Wall Street");
	
		
		System.out.println("Name"+"\t"+"Joining Year"+"\t"+"Address");
		System.out.println(e1.employeeName+"\t"+e1.joiningYear+"\t"+"\t"+e1.empAddress);
		System.out.println(e2.employeeName+"\t"+e2.joiningYear+"\t"+"\t"+e2.empAddress);
		
		
		

	}

}

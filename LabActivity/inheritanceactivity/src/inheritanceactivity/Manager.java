package inheritanceactivity;

public class Manager extends Employee{

	public Manager(long id, String Name, String address, long phone,double salary) {
		super(id, Name, address, phone);
		this.employeeId=id;
		this.employeeName=Name;
		this.employeeaddress=address;
		this.employeephone=phone;
		this.basicsalary=salary;
		
	}
		 public double calculateTransportAllownce() {
			 double transportAllownce = 15*basicsalary/100;
			return transportAllownce;
}
}
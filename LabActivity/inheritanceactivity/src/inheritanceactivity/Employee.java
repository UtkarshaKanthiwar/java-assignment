package inheritanceactivity;

public class Employee {
public long employeeId;
public String employeeName;
public String employeeaddress;
public long employeephone;
public double basicsalary;
public double specialAllowance=250.80;
public double Hra=1000.50;

public Employee(long id, String Name, String address, long phone){
	this.employeeId=id;
	this.employeeName=Name;
	this.employeeaddress=address;
	this.employeephone=phone;
}
 
public double calculateSalary() {
	double salary;
salary = basicsalary+(basicsalary*specialAllowance/100)+(basicsalary*Hra/100);
	return salary;
	}

public void calculateTransportAllowance() {
	double transportAllowance= 10/100*basicsalary;
	return ;
}
	}
	
package main;

class Bank {
	String empName;
	int empId;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	String showEmp() {
		return ("empName=" + empName + "\t" + "empId=" + empId);
	}
	}

public class GetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank emp1 = new Bank();
		emp1.empName = "Mani sai";
		emp1.empId = 605;
		System.out.println(emp1.showEmp());

	}

}

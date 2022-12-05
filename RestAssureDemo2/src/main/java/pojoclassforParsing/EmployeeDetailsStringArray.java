package pojoclassforParsing;

public class EmployeeDetailsStringArray {

	String eName;  
	String eId; 

	int salary;
	String address;
	String []mailId;
	
	

	public EmployeeDetailsStringArray(String eName, String eId,  int salary, String address, String[] mailId) {
		super();
		this.eName = eName;
		this.eId = eId;
		
		this.salary = salary;
		this.address = address;
		this.mailId = mailId;
	}

	public EmployeeDetailsStringArray() {
		
	}

	public String geteName() {
		return eName;
	}



	public void seteName(String eName) {
		this.eName = eName;
	}



	public String geteId() {
		return eId;
	}



	public void seteId(String eId) {
		this.eId = eId;
	}






	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String[] getMailId() {
		return mailId;
	}



	public void setMailId(String[] mailId) {
		this.mailId = mailId;
	}
}

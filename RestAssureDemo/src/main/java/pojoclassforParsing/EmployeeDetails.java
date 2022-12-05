package pojoclassforParsing;

public class EmployeeDetails {
	//declare the variable globally
		String eName;  
	String eID; 
	long phNum;
	String address;
	String email;
	//create constructor for initailizers
	public EmployeeDetails(String eName, String eID, long phNum, String address,String email) {
		super();
		this.eName = eName;
		this.eID = eID;
		this.phNum = phNum;
		this.address = address;
		this.email=email;
	}
	public EmployeeDetails() {
		
	}
//create getters and setters
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteID() {
		return eID;
	}

	public void seteID(String eID) {
		this.eID = eID;
	}

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
	
	
	

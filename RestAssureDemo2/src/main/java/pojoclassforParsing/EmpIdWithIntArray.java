package pojoclassforParsing;

public class EmpIdWithIntArray {

	//declare the variable globally
		String eName;  
		String eId; 
		int []phone;
		int salary;
		String address;
		
		//create constructor for initializers
		public EmpIdWithIntArray(String eName, String eId, int[] phone, int salary, String address) {
			super();
			this.eName = eName;
			this.eId = eId;
			this.phone = phone;
			
			this.salary = salary;
			this.address = address;
		}

		public EmpIdWithIntArray(){
			
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

		public int[] getPhone() {
			return phone;
		}

		public void setPhone(int[] phone) {
			this.phone = phone;
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
	}


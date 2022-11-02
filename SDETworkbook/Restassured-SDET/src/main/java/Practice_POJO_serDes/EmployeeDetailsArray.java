package Practice_POJO_serDes;

public class EmployeeDetailsArray {
	int id;
	String[] name;
	int[] Phone;
	String[] EmailId;
	String address;
	public EmployeeDetailsArray(int id, String[] name, int[] phone, String[] emailId, String address) {
		
		this.id = id;
		this.name = name;
		this.Phone = phone;
		this.EmailId = emailId;
		this.address = address;
	}
		public EmployeeDetailsArray() {
			
		}
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public int[] getPhone() {
		return Phone;
	}
	public void setPhone(int[] phone) {
		Phone = phone;
	}
	public String[] getEmailId() {
		return EmailId;
	}
	public void setEmailId(String[] emailId) {
		EmailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 	

}

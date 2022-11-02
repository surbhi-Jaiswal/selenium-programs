package Practice_POJO_serDes;

public class EmployeeDetails {
//step 1: declare all the variable globally
	String Name;
	int Phone;
	String EmpID;
	String Email;
	boolean isEmployed;
	//step 2: create a constructor to initialize the variables
	public EmployeeDetails(String name, int phone, String empID, String email, boolean isEmployed) {
		
		this.Name = name;
		this.Phone = phone;
		this.EmpID = empID;
		this.Email = email;
		this.isEmployed = isEmployed;
	}
		public EmployeeDetails() 
	{
			
	}
	//step 3: provide getters and setters
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getEmpID() {
		return EmpID;
	}
	public void setEmpID(String empID) {
		EmpID = empID;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public boolean isEmployed() {
		return isEmployed;
	}
	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	

	
}

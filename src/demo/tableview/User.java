package demo.tableview;

public class User {
	private String name;
	private String gender;
	private String email;
	private String address;
	
	public User(String name, String gender, String address, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", email=" + email + ", address=" + address + "]";
	}
	
}

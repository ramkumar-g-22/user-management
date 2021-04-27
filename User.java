
public class User {

	static String department;
	public String name;
	public String email;
	public String password;
	
	public User(String name, String email, String password){
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public String toString() {
		return "Name : " + name + ", Email : " + email + ", Password : " + password;		
	}
		
}

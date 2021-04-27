
public class TestUserManager {
	public static void main(String[] args) {
		
		User user1 = new User("Ramkumar", "ram@mail.com", "1234");
		User user2 = new User("Virat", "virat@mail.com", "8575");
		User user3 = new User("John", "john@mail.com", "9202");

		UserManager.login("Ramkumar");
		
		UserManager.displayUsers();
		
		UserManager.addUser(user1);
		UserManager.addUser(user2);
		UserManager.addUser(user3);
		
		UserManager.login("Ramkumar");
		UserManager.displayUsers();

		UserManager.changeUserName("Ramkumar", "Ram");
		UserManager.displayUsers();
		
		UserManager.changePassword("John", "john123");		
		UserManager.displayUsers();
		
		UserManager.changeEmail("John", "john123@gmail.com");
		UserManager.displayUsers();


		UserManager.removeUser("John");
		UserManager.displayUsers();

	}
}

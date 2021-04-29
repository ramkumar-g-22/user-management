package in.ramkumar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUserManager {

	@Test
	public void testAddUserWithValidInput() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		boolean isValidUser = UserManager.addUser(user);
		assertTrue(isValidUser);
	}
	
	@Test
	public void testAddUserWithInValidName() {
		User user = new User(null, "ram@mail.com", "123");
		boolean isValidUser = UserManager.addUser(user);
		assertFalse(isValidUser);
	}
	
	@Test
	public void testAddUserWithInValidEmail() {
		User user = new User("John1", null, "123");
		boolean isValidUser = UserManager.addUser(user);
		assertFalse(isValidUser);
	}
	
	@Test
	public void testAddUserWithInValidPassword() {
		User user = new User("John2", "john@mail.com", null);
		boolean isValidUser = UserManager.addUser(user);
		assertFalse(isValidUser);
	}
	
	@Test
	public void testAddUserWithInValidNameAndPassword() {
		User user = new User(null, "john@mail.com", null);
		boolean isValidUser = UserManager.addUser(user);
		assertFalse(isValidUser);
	}
	
	@Test
	public void testAddUserWithInValidNameAndEmail() {
		User user = new User(null, null, "pass1234");
		boolean isValidUser = UserManager.addUser(user);
		assertFalse(isValidUser);
	}
	
	@Test
	public void testAddUserWithInValidPasswordAndEmail() {
		User user = new User("Jay", null, null);
		boolean isValidUser = UserManager.addUser(user);
		assertFalse(isValidUser);
	}
	
	@Test
	public void testDisplayUsers() {
		UserManager.displayUsers();
	}
	
	@Test
	public void testRemoveValidUser() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);	
		boolean isUserRemoved = UserManager.removeUser("Ramkumar");
		assertTrue(isUserRemoved);
	}
	
	@Test
	public void testRemoveInValidUser() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);	
		boolean isUserRemoved = UserManager.removeUser("Ram");
		assertFalse(isUserRemoved);
	}
	
	@Test
	public void testGetValidUserIndex() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);	
		int userIndex = UserManager.getUserIndex("Ramkumar");
		assertNotEquals(-1, userIndex);
	}
	
	@Test
	public void testGetInValidUserIndex() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);	
		int userIndex = UserManager.getUserIndex("Ram");
		assertEquals(-1, userIndex);
	}
	
	@Test
	public void testChangeValidUserName() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);
		boolean isUserNameChanged = UserManager.changeUserName("Ramkumar", "Ram");
		assertTrue(isUserNameChanged);
	}
	
	@Test
	public void testChangeInValidUserName() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);
		boolean isUserNameChanged = UserManager.changeUserName("Ram", "John");
		assertFalse(isUserNameChanged);
	}
	
	@Test
	public void testChangeValidPassword() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);
		boolean isPasswordChanged = UserManager.changePassword("Ramkumar", "pass123");
		assertTrue(isPasswordChanged);
	}
	
	@Test
	public void testChangeInValidPassword() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);
		boolean isPasswordChanged = UserManager.changePassword("Ram", "John");
		assertFalse(isPasswordChanged);
	}
	
	@Test
	public void testChangeValidEmail() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);
		boolean isEmailChanged = UserManager.changeEmail("Ramkumar", "ramkumar@gmail.com");
		assertTrue(isEmailChanged);
	}
	
	@Test
	public void testChangeInValidEmail() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);
		boolean isEmailChanged = UserManager.changeEmail("Ram", "ramkumar@gmail.com");
		assertFalse(isEmailChanged);
	}
	
	@Test
	public void testLoginWithValidUser() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);
		boolean isValidUser = UserManager.login("Ramkumar");
		assertTrue(isValidUser);
	}
	
	@Test
	public void testLoginWithInValidUser() {
		User user = new User("Ramkumar", "ram@mail.com", "123");
		UserManager.addUser(user);
		boolean isValidUser = UserManager.login("Ram");
		assertFalse(isValidUser);
	}
	
}

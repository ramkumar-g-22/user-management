package in.ramkumar;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	
	static List<User> userList = new ArrayList<User>();
	
	public static boolean addUser(User user) {
		boolean validUser = false;
		if (user.name != null  && user.email != null && user.password != null) {
			userList.add(user);
			validUser = true;
			System.out.println("User added successfully : " + user.name);
		}else {
			System.out.println("Not a valid user : " + user.name);
		}
		return validUser;
	}
	

	public static void displayUsers() {
		System.out.println("User lists : " + userList.size());
		for (User user : userList) {
			System.out.println(user);
		}
	}
	
	public static boolean removeUser(String name) {
		boolean validuser = false;
		int userIndex = getUserIndex(name);
		if (userIndex != -1) {
			userList.remove(userIndex);
			validuser = true;
			System.out.println("User successfully removed");
		}else {
			validuser = false;
			System.out.println("User " + name + " doesn\'t exists");
		}
		return validuser;
	}

	public static int getUserIndex(String name) {
		int userIndex = -1;
		for (User user : userList) {
			if(user.name.equals(name)) {
				userIndex = userList.indexOf(user);
				break;
			}
		}
		return userIndex;
	}


	public static boolean changeUserName(String oldUserName, String newUserName) {
		boolean validUser = false;
		int userIndex = getUserIndex(oldUserName);
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.name = newUserName;
			userList.set(userIndex, user);
			validUser = true;
			System.out.println("Username " + oldUserName + " is successfully changed to " + newUserName);
		}else {
			validUser = false;
			System.out.println("User " + oldUserName  + " doesn\'t exists");
		}
		return validUser;
	}

	public static boolean changePassword(String userName, String newPassword) {
		boolean validUser = false;
		int userIndex = getUserIndex(userName);
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.password = newPassword;
			userList.set(userIndex, user);
			validUser = true;
			System.out.println("Password changed successfully");
		}else {
			validUser = false;
			System.out.println("User " + userName  + " doesn\'t exists");
		}
		return validUser;
	}


	public static boolean changeEmail(String userName, String newEmail) {
		boolean validUser = false;
		int userIndex = getUserIndex(userName);
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.email = newEmail;
			userList.set(userIndex, user);
			validUser = true;
			System.out.println("Email changed successfully");
		}else {
			validUser = false;
			System.out.println("User " + userName  + " doesn\'t exists");
		}
		return validUser;
	}

	
	public static boolean login(String userName) {
		// TODO Auto-generated method stub
		boolean validUser = false;
		int userIndex = getUserIndex(userName);
		if (userIndex != -1) {
			validUser = true;
			System.out.println("Successfully logged in as " + userName);
		}else {
			validUser = false;
			System.out.println("User " + userName  + " doesn\'t exists");
		}
		return validUser;

	}
	
	
}

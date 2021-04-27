import java.util.ArrayList;
import java.util.List;

public class UserManager {
	static List<User> userList = new ArrayList<User>();
	
	public static void addUser(User user) {
		userList.add(user);
		System.out.println("User added successfully");
	}
	
	public static void displayUsers() {
		System.out.println("User lists : " + userList.size());
		for (User user : userList) {
			System.out.println(user);
		}
	}
	
	public static void removeUser(String name) {
		int userIndex = getUserIndex(name);
		if (userIndex != -1) {
			userList.remove(userIndex);
			System.out.println("User successfully removed");
		}else {
			System.out.println("User " + name + " doesn\'t exists");
		}
	}

	private static int getUserIndex(String name) {
		int userIndex = -1;
		for (User user : userList) {
			if(user.name.equals(name)) {
				userIndex = userList.indexOf(user);
				break;
			}
		}
		return userIndex;
	}


	public static void changeUserName(String oldUserName, String newUserName) {
		int userIndex = getUserIndex(oldUserName);
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.name = newUserName;
			userList.set(userIndex, user);
			System.out.println("Username " + oldUserName + " is successfully changed to " + newUserName);
		}else {
			System.out.println("User " + oldUserName  + " doesn\'t exists");
		}
	}

	public static void changePassword(String userName, String newPassword) {
		int userIndex = getUserIndex(userName);
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.password = newPassword;
			userList.set(userIndex, user);
			System.out.println("Password changed successfully");
		}else {
			System.out.println("User " + userName  + " doesn\'t exists");
		}
	}


	public static void changeEmail(String userName, String newEmail) {
		int userIndex = getUserIndex(userName);
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.email = newEmail;
			userList.set(userIndex, user);
			System.out.println("Email changed successfully");
		}else {
			System.out.println("User " + userName  + " doesn\'t exists");
		}
	}

	
	public static void login(String userName) {
		// TODO Auto-generated method stub
		int userIndex = getUserIndex(userName);
		if (userIndex != -1) {
			System.out.println("Successfully logged in as " + userName);
		}else {
			System.out.println("User " + userName  + " doesn\'t exists");
		}

	}
	
	
}

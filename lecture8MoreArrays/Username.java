public class Username {
	// Creates a username by concatenating the command line arguments provided by the user

	public static void main(String[] args) {
		String username = "";
		for (int  i = 0; i < args.length; i++) {
			username  = username + args[i];
		}

		System.out.println("Your username is " + username);
	}


}
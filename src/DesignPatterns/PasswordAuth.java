package DesignPatterns;

public class PasswordAuth implements AuthMethod {
	public void authenticate(String user) {
		System.out.println("Password authentication for " + user);
	}

}

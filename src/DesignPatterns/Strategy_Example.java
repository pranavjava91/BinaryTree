package DesignPatterns;

public class Strategy_Example {

	public static void main(String[] args) {
		LoginService login1 = new LoginService(new PasswordAuth());
		login1.login("Ravi");
		LoginService login2 = new LoginService(new OtpAuth());
		login2.login("Kiran");
	}

}

/*
 * A Java authentication module supports different login mechanisms. Some users
 * log in with a password, some with an OTP, and some using fingerprint through
 * a device. The LoginService currently checks all these conditions inside one
 * method. As new login methods get added, this class keeps growing, making it
 * hard to maintain and test. We need a design where the login method can change
 * without modifying the LoginService. The service should just execute a login
 * process, and the actual authentication method should be selected at runtime
 * based on the user's preference. Which design pattern helps define multiple
 * authentication mechanisms and allows us switch between them without changing
 * the main service?
 */

/*
 * This is solved using the Strategy Pattern. Each authentication approach
 * becomes a separate class, and the service uses one of them at runtime. The
 * authentication logic stays isolated, and the main service remains clean.
 */
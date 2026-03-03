package DesignPatterns;

public class OtpAuth implements AuthMethod {
	public void authenticate(String user) {
		System.out.println("OTP authentication for " + user);
	}
}

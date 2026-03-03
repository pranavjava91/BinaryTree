package DesignPatterns;

public class FingerprintAuth implements AuthMethod {
	public void authenticate(String user) {
		System.out.println("Fingerprint authentication for " + user);
	}

}

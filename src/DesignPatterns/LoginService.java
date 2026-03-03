package DesignPatterns;

public class LoginService {
	private AuthMethod method;

	LoginService(AuthMethod method) {
		this.method = method;
	}

	void login(String user) {
		method.authenticate(user);
	}

}

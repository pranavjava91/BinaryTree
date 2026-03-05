package AdvancedDesignPatterns;

abstract class RequestHandler {
	protected RequestHandler next;

	public void setNext(RequestHandler next) {
		this.next = next;
	}

	public abstract void handle(String request);
}

class AuthHandler extends RequestHandler {
	public void handle(String request) {
		if (request.contains("token")) {
			System.out.println("Authentication Passed");
			if (next != null)
				next.handle(request);
		} else {
			System.out.println("Authentication Failed");
		}
	}
}

class RoleHandler extends RequestHandler {
	public void handle(String request) {
		if (request.contains("ADMIN")) {
			System.out.println("Authorization Passed");
			if (next != null)
				next.handle(request);
		} else {
			System.out.println("Authorization Failed");
		}
	}
}

class ValidationHandler extends RequestHandler {
	public void handle(String request) {
		if (request.length() > 10) {
			System.out.println("Validation Passed");
			if (next != null)
				next.handle(request);
		} else {
			System.out.println("Validation Failed");
		}
	}
}

package AdvancedDesignPatterns;

public class Chain_Example {

	public static void main(String[] args) {
		RequestHandler auth = new AuthHandler();
		RequestHandler role = new RoleHandler();
		RequestHandler validation = new ValidationHandler();

		auth.setNext(role);
		role.setNext(validation);

		System.out.println("Processing request:");
		auth.handle("token-ADMIN-access");
	}

}


/*
 * Design Question 22 A Java web application processes incoming HTTP requests.
 * Before the request reaches the controller, it must pass through several
 * checks: Authentication, Authorization, and Input Validation. Each check is
 * done by a different component. If authentication fails, the request should
 * not move forward. If it passes, the authorization should verify user roles.
 * Finally, the input validation checks request data. If we put all these checks
 * inside one method, the code becomes long and difficult to extend. We need a
 * design where each validator performs its task and passes the request to the
 * next validator only if its own check passes. Which design pattern allows a
 * request to move through a chain of objects until one of them processes or
 * stops it?
 */

/*
 * This can be solved using the Chain of Responsibility Pattern. Each check is a
 * separate handler. The request flows through the chain until one reject it or
 * the chain finishes successfully.
 */

/*
 * Chain of Responsibility avoids long condition blocks. Each handler works
 * independently and passes the request along the chain if it succeeds.
 */
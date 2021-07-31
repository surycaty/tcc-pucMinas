package br.com.adriano.tcc.user.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2091992174646377060L;

	public UserNotFoundException() {
		super("User Not Found");
	}

}

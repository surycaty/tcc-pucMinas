package br.com.adriano.tcc.address.exception;

public class AddressNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6326721574675699571L;
	
	public AddressNotFoundException() {
		super("Address Not Found");
	}

}

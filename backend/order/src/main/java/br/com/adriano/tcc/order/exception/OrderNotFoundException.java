package br.com.adriano.tcc.order.exception;

public class OrderNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 3377058517660945606L;

	public OrderNotFoundException() {
		super("Order Not Found");
	}
}

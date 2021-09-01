package br.com.adriano.tcc.user.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtils {

	private PasswordUtils() {
		throw new IllegalStateException(PasswordUtils.class.getName());
	}

	private static final String ALGORITM_TYPE = "SHA1";

	public static String encrypt(String input) throws NoSuchAlgorithmException {

		MessageDigest mDigest = MessageDigest.getInstance(ALGORITM_TYPE);

		byte[] result = mDigest.digest(input.getBytes());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}

		return sb.toString();
	}

}

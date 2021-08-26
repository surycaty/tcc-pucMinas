package br.com.adriano.tcc.auth.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDTO {
	
	private String userName;
	private String password;
	
}

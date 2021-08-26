package br.com.adriano.tcc.auth.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class TokenDTO {
	
	private String token;

}

package br.com.adriano.tcc.auth.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.adriano.tcc.auth.dto.TokenDTO;
import br.com.adriano.tcc.auth.dto.UserDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
	
	private static final long expirationTime = 180000;
	private String keyValidation = "MyValidationKey";
	
	public TokenDTO generateToken(UserDTO dto) {
		return TokenDTO.builder()
				.token(Jwts.builder()
						.setIssuedAt(new Date(System.currentTimeMillis()))
						.setSubject("JWT Auth API")
						.setExpiration(new Date(System.currentTimeMillis() + expirationTime))
						.signWith(SignatureAlgorithm.HS256, keyValidation)
						.compact())
				.build() ;		
	}

}

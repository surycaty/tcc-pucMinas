package br.com.adriano.tcc.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adriano.tcc.auth.dto.TokenDTO;
import br.com.adriano.tcc.auth.dto.UserDTO;
import br.com.adriano.tcc.auth.service.TokenService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TokenDTO> getAuth(@RequestBody UserDTO user) {
		
		return ResponseEntity.ok(tokenService.generateToken(user));
	}

}

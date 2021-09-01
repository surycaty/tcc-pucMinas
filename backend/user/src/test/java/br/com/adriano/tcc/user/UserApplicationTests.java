package br.com.adriano.tcc.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.adriano.tcc.user.dto.UserDTO;

@SpringBootTest
class UserApplicationTests {
	
	private UserDTO dto = UserDTO.builder()
							.name("Adriano Almeida")
							.email("email@email.com")
						.build();

	@Test
	void dtoSuccessTest() {
		assertEquals(dto, UserDTO.builder()
							.name("Adriano Almeida")
							.email("email@email.com")
						.build());
	}

}

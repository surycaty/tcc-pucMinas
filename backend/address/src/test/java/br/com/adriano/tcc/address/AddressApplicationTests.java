package br.com.adriano.tcc.address;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.adriano.tcc.address.dto.AddressDTO;

@SpringBootTest
class AddressApplicationTests {
	
	private AddressDTO dto = AddressDTO.builder()
								.name("Test Address")
								.street("Test Street")
							.build();

	@Test
	void dtoSuccessTest() {
		assertEquals(dto, AddressDTO.builder()
							.name("Test Address")
							.street("Test Street")
						.build());
	}

}

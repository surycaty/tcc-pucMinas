package br.com.adriano.tcc.order.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OrderDTOTest {
	
	OrderDTO dto;

	@BeforeAll
	void test() {
		dto = OrderDTO.builder()
					.id(1L)
					.name("Adriano TCC")
					.description("Teste para o TCC")
					.coordenate("-1 -2")
				.build();
	}
	
	@Test
	void dtoTestSuccess() {
		assertEquals(dto, OrderDTO.builder()
								.id(1L)
								.name("Adriano TCC")
								.description("Teste para o TCC")
								.coordenate("-1 -2")
							.build());
	}

}

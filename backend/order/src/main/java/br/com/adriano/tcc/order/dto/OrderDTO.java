package br.com.adriano.tcc.order.dto;

import br.com.adriano.tcc.order.model.OrderModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString
public class OrderDTO {

	private Long id;
	private String name;
	private String description;
	private String coordenate;
	private Long userId;

	public OrderDTO(OrderModel model) {
		this.id = model.getId();
		this.name = model.getName();
		this.description = model.getDescription();
		this.coordenate = model.getCoordenate();
		this.userId = model.getUserId();
	}
	
	public OrderModel modelConverter() {
		return OrderModel.builder()
					.id(this.id)
					.name(this.name)
					.description(this.description)
					.coordenate(this.coordenate)
					.userId(this.userId)
				.build();
	}
	
}
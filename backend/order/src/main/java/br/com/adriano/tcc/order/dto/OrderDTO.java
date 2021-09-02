package br.com.adriano.tcc.order.dto;

import java.time.LocalDateTime;

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
	private String createDate;
	private String updateDate;
	private Long userId;

	public OrderDTO(OrderModel model) {
		this.id = model.getId();
		this.name = model.getName();
		this.description = model.getDescription();
		this.coordenate = model.getCoordenate();
		this.createDate = model.getCreateDate().toString();
		this.updateDate = model.getUpdateDate().toString();
		this.userId = model.getUserId();
	}
	
	public OrderModel modelConverter() {
		return OrderModel.builder()
					.id(this.id)
					.name(this.name)
					.description(this.description)
					.coordenate(this.coordenate)
					.createDate(LocalDateTime.parse(this.createDate))
					.updateDate(LocalDateTime.parse(this.updateDate))
					.userId(this.userId)
				.build();
	}
	
}

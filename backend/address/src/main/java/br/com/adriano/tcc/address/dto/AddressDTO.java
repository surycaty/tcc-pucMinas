package br.com.adriano.tcc.address.dto;

import br.com.adriano.tcc.address.model.AddressModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString
public class AddressDTO {

	private Long id;
	private String name;
	private String street;
	private String number;
	private String zipCode;
	private String complemento;
	private String coordenate;
	private Long userId;

	public AddressDTO(AddressModel model) {
		this.id = model.getId();
		this.name = model.getName();
		this.street = model.getStreet();
		this.number = model.getNumber();
		this.zipCode = model.getZipCode();
		this.complemento = model.getComplemento();
		this.coordenate = model.getCoordenate();
		this.userId = model.getUserId();
		
	}
	
	public AddressModel modelConverter() {
		return AddressModel.builder()
					.id(this.id)
					.name(this.name)
					.street(this.street)
					.number(this.number)
					.zipCode(this.zipCode)
					.complemento(this.complemento)
					.coordenate(this.coordenate)
					.userId(this.userId)
				.build();
	}
	
}

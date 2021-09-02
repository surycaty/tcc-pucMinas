package br.com.adriano.tcc.address.dto;

import java.time.LocalDateTime;

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
	private String complement;
	private String coordenate;
	private String createDate;
	private String updateDate;
	private Long userId;

	public AddressDTO(AddressModel model) {
		this.id = model.getId();
		this.name = model.getName();
		this.street = model.getStreet();
		this.number = model.getNumber();
		this.zipCode = model.getZipCode();
		this.complement = model.getComplement();
		this.coordenate = model.getCoordenate();
		this.createDate = model.getCreateDate().toString();
		this.updateDate = model.getUpdateDate().toString();
		this.userId = model.getUserId();
		
	}
	
	public AddressModel modelConverter() {
		return AddressModel.builder()
					.id(this.id)
					.name(this.name)
					.street(this.street)
					.number(this.number)
					.zipCode(this.zipCode)
					.complement(this.complement)
					.coordenate(this.coordenate)
					.createDate(LocalDateTime.parse(this.createDate))
					.updateDate(LocalDateTime.parse(this.updateDate))
					.userId(this.userId)
				.build();
	}
	
}

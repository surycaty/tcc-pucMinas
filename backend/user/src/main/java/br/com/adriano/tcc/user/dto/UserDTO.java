package br.com.adriano.tcc.user.dto;

import br.com.adriano.tcc.user.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString
public class UserDTO {
	
	private Long id;
	private String name;
	private String document;
	private String email;
	

	public UserDTO(UserModel model) {
		this.id = model.getId();
		this.name = model.getName();
		this.document = model.getDocument();
		this.email = model.getEmail();
	}
	
	public UserModel modelConverter() {
		return UserModel.builder()
					.id(this.id)
					.name(this.name)
					.document(this.document)
					.email(this.email)
				.build();
	}
	
	
}

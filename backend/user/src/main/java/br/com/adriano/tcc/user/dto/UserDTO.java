package br.com.adriano.tcc.user.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

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
	private String username;

	 @JsonInclude(JsonInclude.Include.NON_NULL)
	private String password;

	private String createDate;
	private String updateDate;

	public UserDTO(UserModel model) {
		this.id = model.getId();
		this.name = model.getName();
		this.document = model.getDocument();
		this.email = model.getEmail();
		this.username = model.getUsername();
		this.createDate = model.getCreateDate().toString();
		this.updateDate = model.getUpdateDate().toString();
	}

	public UserModel modelConverter() {
		
		return UserModel.builder()
					.id(this.id)
					.name(this.name)
					.document(this.document)
					.email(this.email)
					.username(this.username)
					.password(this.password)
					.createDate(LocalDateTime.parse(this.createDate))
					.updateDate(LocalDateTime.parse(this.updateDate))
				.build();
	}

}

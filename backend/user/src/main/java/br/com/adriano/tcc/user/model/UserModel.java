package br.com.adriano.tcc.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(schema = "tcc", name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(columnDefinition = "text", nullable = false)
	private String name;
	
	@Column(columnDefinition = "text", nullable = false)
	private String document;
	
	@Column(columnDefinition = "text", nullable = false)
	private String email;
	
	
}

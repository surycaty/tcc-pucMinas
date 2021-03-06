package br.com.adriano.tcc.address.model;

import java.time.LocalDateTime;

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
@Table(schema = "tcc", name = "address")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddressModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(columnDefinition = "text", nullable = false)
	private String name;
	
	@Column(columnDefinition = "text", nullable = false)
	private String street;
	
	@Column(columnDefinition = "text")
	private String number;
	
	@Column(columnDefinition = "text")
	private String zipCode;
	
	@Column(columnDefinition = "text")
	private String complement;
	
	@Column(columnDefinition = "text")
	private String coordenate;
	
	@Column(columnDefinition = "datetime")
	private LocalDateTime createDate;
	
	@Column(columnDefinition = "datetime")
	private LocalDateTime updateDate;
	
	@Column(name = "id_user", nullable = false)
	private Long userId;
	
	
}

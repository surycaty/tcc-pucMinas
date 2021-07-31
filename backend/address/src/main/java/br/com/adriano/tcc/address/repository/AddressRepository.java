package br.com.adriano.tcc.address.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriano.tcc.address.model.AddressModel;

public interface AddressRepository extends JpaRepository<AddressModel, Long> {
	
	Optional<List<AddressModel>> findAllByUserId(Long userId);

}

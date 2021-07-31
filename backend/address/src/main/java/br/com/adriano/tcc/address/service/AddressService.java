package br.com.adriano.tcc.address.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adriano.tcc.address.dto.AddressDTO;
import br.com.adriano.tcc.address.exception.AddressNotFoundException;
import br.com.adriano.tcc.address.model.AddressModel;
import br.com.adriano.tcc.address.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repository;
	
	public Optional<List<AddressModel>> getAddresses(Long userId) {
		return repository.findAllByUserId(userId);
	}
	
	public Optional<AddressModel> getAddress(Long id) {
		return repository.findById(id);
	}

	public AddressModel addAddress(AddressDTO dto) {
		return repository.save(dto.modelConverter());
	}

	public AddressModel editAddress(AddressDTO dto) {
		if(repository.existsById(dto.getId()))
			return repository.save(dto.modelConverter());
		
		throw new AddressNotFoundException();
	}

	public void deleteAddress(Long modelId) {
		repository.deleteById(modelId);
	}
}
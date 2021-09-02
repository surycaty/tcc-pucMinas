package br.com.adriano.tcc.address.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	public List<AddressDTO> getAddresses(Long userId) {
		
		Optional<List<AddressModel>> addresses = repository.findAllByUserId(userId);
		
		if(addresses.isPresent()) {
			return addresses.get()
					.stream().map(AddressDTO::new)
					.collect(Collectors.toList());
		}
		
		return new ArrayList<>();
		
	}
	
	public AddressDTO getAddress(Long id) {
		Optional<AddressModel> model = repository.findById(id);
		
		if (model.isPresent()) {
			return new AddressDTO(model.get());
		}
		
		throw new AddressNotFoundException();
	}

	public AddressDTO addAddress(AddressDTO dto) {
		
		LocalDateTime addedDate = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		
		dto.setCreateDate(addedDate.format(formatter));
		dto.setUpdateDate(addedDate.format(formatter));
		
		return new AddressDTO(repository.save(dto.modelConverter()));
	}

	public AddressDTO editAddress(AddressDTO dto) {
		
		Optional<AddressModel> model = repository.findById(dto.getId());
		
		if(model.isPresent()) {
			
			dto.setCreateDate(model.get().getCreateDate().toString());
			
			LocalDateTime addedDate = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
			
			dto.setUpdateDate(addedDate.format(formatter));
			
			return new AddressDTO(repository.save(dto.modelConverter()));
		}
		
		throw new AddressNotFoundException();
	}

	public void deleteAddress(Long modelId) {
		repository.deleteById(modelId);
	}
}

package br.com.adriano.tcc.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adriano.tcc.user.dto.UserDTO;
import br.com.adriano.tcc.user.exception.UserNotFoundException;
import br.com.adriano.tcc.user.model.UserModel;
import br.com.adriano.tcc.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> getUsers() {
		return repository.findAll().stream().map(UserDTO::new)
					.collect(Collectors.toList());
	}
	
	public UserDTO getUser(Long id) {
		Optional<UserModel> user = repository.findById(id);
		if (user.isPresent()) {
			return new UserDTO(user.get());
		}
		
		throw new UserNotFoundException();
	}

	public UserDTO addUser(UserDTO model) {
		return new UserDTO(repository.save(model.modelConverter()));
	}

	public UserDTO editUser(UserDTO model) {
		if(repository.existsById(model.getId()))
			return new UserDTO(repository.save(model.modelConverter()));
		
		throw new UserNotFoundException(); 
	}

	public void deleteUser(Long modelId) {
		repository.deleteById(modelId);
	}
}

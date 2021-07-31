package br.com.adriano.tcc.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adriano.tcc.user.exception.UserNotFoundException;
import br.com.adriano.tcc.user.model.UserModel;
import br.com.adriano.tcc.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserModel> getUsers() {
		return repository.findAll();
	}
	
	public Optional<UserModel> getUser(Long id) {
		return repository.findById(id);
	}

	public UserModel addUser(UserModel model) {
		return repository.save(model);
	}

	public UserModel editUser(UserModel model) {
		if(repository.existsById(model.getId()))
			return repository.save(model);
		
		throw new UserNotFoundException(); 
	}

	public void deleteUser(Long modelId) {
		repository.deleteById(modelId);
	}
}

package br.com.adriano.tcc.user.service;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.adriano.tcc.user.dto.UserDTO;
import br.com.adriano.tcc.user.exception.UserNotFoundException;
import br.com.adriano.tcc.user.model.UserModel;
import br.com.adriano.tcc.user.repository.UserRepository;
import br.com.adriano.tcc.user.utils.PasswordUtils;

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

	public UserDTO addUser(UserDTO dto) throws NoSuchAlgorithmException {
		LocalDateTime addedDate = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		
		dto.setCreateDate(addedDate.format(formatter));
		dto.setUpdateDate(addedDate.format(formatter));
		
		dto.setPassword(PasswordUtils.encrypt(dto.getPassword()));
		
		return new UserDTO(repository.save(dto.modelConverter()));
	}

	public UserDTO editUser(UserDTO dto) throws NoSuchAlgorithmException {
		
		Optional<UserModel> model = repository.findById(dto.getId());
		
		if(model.isPresent()) {

			if(!StringUtils.hasText(dto.getUsername())) {
				dto.setUsername(model.get().getUsername());
			}

			if(!StringUtils.hasText(dto.getPassword())) {
				dto.setPassword(PasswordUtils.encrypt(model.get().getPassword()));
			}
			
			dto.setCreateDate(model.get().getCreateDate().toString());
			
			LocalDateTime addedDate = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
			
			dto.setUpdateDate(addedDate.format(formatter));
			
			return new UserDTO(repository.save(dto.modelConverter()));
		}
		
		throw new UserNotFoundException(); 
	}

	public void deleteUser(Long modelId) {
		repository.deleteById(modelId);
	}
}

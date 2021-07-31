package br.com.adriano.tcc.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adriano.tcc.user.model.UserModel;
import br.com.adriano.tcc.user.service.UserService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping(path = "${server.contexPath}",
				produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.getUsers());
    }

	@GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.getUser(id));
    }

	@PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserModel model) {
		log.info("Add User bodyIn {}", model);
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.addUser(model));
    }

	@PutMapping
    public ResponseEntity<?> editUser(@RequestBody UserModel model) {
		log.info("Edit User bodyIn {}", model);
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.editUser(model));
    }

	@DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		service.deleteUser(id);
        return ResponseEntity.ok("{ \"result\": \"Deleted!\" }");
    }
}
package br.com.adriano.tcc.address.controller;


import java.util.List;

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

import br.com.adriano.tcc.address.dto.AddressDTO;
import br.com.adriano.tcc.address.service.AddressService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping(path = "${server.contexPath}",
				produces = MediaType.APPLICATION_JSON_VALUE)
public class AddressController {
	
	@Autowired
	private AddressService service;

	@GetMapping("/{userId}/address")
    public ResponseEntity<List<AddressDTO>> getAddresses(@PathVariable Long userId) {
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.getAddresses(userId));
    }

	@GetMapping("/{userId}/address/{id}")
    public ResponseEntity<AddressDTO> getAddress(@PathVariable Long userId, @PathVariable Long id) {
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.getAddress(id));
    }

	@PostMapping("/{userId}/address")
    public ResponseEntity<AddressDTO> addAddress(@PathVariable Long userId, @RequestBody AddressDTO dto) {
		log.info("Add Address by User {} and bodyIn {}", userId, dto);
		dto.setUserId(userId);
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.addAddress(dto));
    }

	@PutMapping("/{userId}/address")
    public ResponseEntity<AddressDTO> editAddress(@PathVariable Long userId, @RequestBody AddressDTO dto) {
		log.info("Edit Address by user {} and bodyIn {}", userId, dto);
		dto.setUserId(userId);
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.editAddress(dto));
    }

	@DeleteMapping("/{userId}/address/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable Long userId, @PathVariable Long id) {
		service.deleteAddress(id);
        return ResponseEntity.ok("{ \"result\": \"Deleted!\" }");
    }
}

package br.com.adriano.tcc.order.controller;


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

import br.com.adriano.tcc.order.dto.OrderDTO;
import br.com.adriano.tcc.order.service.OrderService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping(path = "${server.contexPath}",
				produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
	
	@Autowired
	private OrderService service;

	@GetMapping("/{userId}/order")
    public ResponseEntity<List<OrderDTO>> getOrders(@PathVariable Long userId) {
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.getOrders(userId));
    }

	@GetMapping("/{userId}/order/{id}")
    public ResponseEntity<OrderDTO> getOrder(@PathVariable Long userId, @PathVariable Long id) {
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.getOrder(id));
    }

	@PostMapping("/{userId}/order")
    public ResponseEntity<OrderDTO> addOrder(@PathVariable Long userId, @RequestBody OrderDTO dto) {
		log.info("Add Order by User {} and bodyIn {}", userId, dto);
		dto.setUserId(userId);
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.addOrder(dto));
    }

	@PutMapping("/{userId}/order")
    public ResponseEntity<OrderDTO> editOrder(@PathVariable Long userId, @RequestBody OrderDTO dto) {
		log.info("Edit Order by User {} and bodyIn {}", userId, dto);
		dto.setUserId(userId);
        return ResponseEntity.ok()
        		.headers(new HttpHeaders())
                .body(service.editOrder(dto));
    }

	@DeleteMapping("/{userId}/order/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long userId, @PathVariable Long id) {
		service.deleteOrder(id);
        return ResponseEntity.ok("{ \"result\": \"Deleted!\" }");
    }
}

package br.com.adriano.tcc.order.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adriano.tcc.order.dto.OrderDTO;
import br.com.adriano.tcc.order.exception.OrderNotFoundException;
import br.com.adriano.tcc.order.model.OrderModel;
import br.com.adriano.tcc.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<OrderDTO> getOrders(Long userId) {
		
		Optional<List<OrderModel>> optionals = repository.findAllByUserId(userId);
		
		if(optionals.isPresent()) {
		return optionals.get().parallelStream().map(OrderDTO::new)
				.collect(Collectors.toList());
		}
		
		throw new OrderNotFoundException(); 
	}
	
	public OrderDTO getOrder(Long id) {
		Optional<OrderModel> optional = repository.findById(id);
		if(optional.isPresent()) {
			return new OrderDTO(optional.get());
		}
		
		throw new OrderNotFoundException();
	}

	public OrderDTO addOrder(OrderDTO dto) {
		
		LocalDateTime addedDate = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		
		dto.setCreateDate(addedDate.format(formatter));
		dto.setUpdateDate(addedDate.format(formatter));
		
		return new OrderDTO(repository.save(dto.modelConverter()));
	}

	public OrderDTO editOrder(OrderDTO dto) {

		Optional<OrderModel> model = repository.findById(dto.getId());
		
		if(model.isPresent()) {
			
			dto.setCreateDate(model.get().getCreateDate().toString());
			
			LocalDateTime addedDate = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
			
			dto.setUpdateDate(addedDate.format(formatter));
			
			return new OrderDTO(repository.save(dto.modelConverter()));
		}
		
		throw new OrderNotFoundException();
	}

	public void deleteOrder(Long modelId) {
		repository.deleteById(modelId);
	}
}

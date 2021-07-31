package br.com.adriano.tcc.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriano.tcc.order.model.OrderModel;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {
	
	Optional<List<OrderModel>> findAllByUserId(Long userId);

}

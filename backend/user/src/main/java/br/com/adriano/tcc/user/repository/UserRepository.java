package br.com.adriano.tcc.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriano.tcc.user.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}

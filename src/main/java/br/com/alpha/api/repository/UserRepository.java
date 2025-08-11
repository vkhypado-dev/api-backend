package br.com.alpha.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.alpha.api.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}

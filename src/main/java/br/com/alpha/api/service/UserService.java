package br.com.alpha.api.service;

import org.springframework.stereotype.Service;

import br.com.alpha.api.model.User;
import br.com.alpha.api.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> listAll() {
        return repository.findAll();
    }

    public Optional<User> findById(String id) {
        return repository.findById(id);
    }

    public User saveUser(User usuario) {
        return repository.save(usuario);
    }

    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}

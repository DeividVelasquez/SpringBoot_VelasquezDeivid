package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public User save(User user) {
        user.setId(counter.incrementAndGet());
        users.add(user);
        return user;
    }

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public void update(User user) {
        users.replaceAll(existingUser -> existingUser.getId().equals(user.getId()) ? user : existingUser);
    }

    public void delete(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}

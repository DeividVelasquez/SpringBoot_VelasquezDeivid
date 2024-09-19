package com.example.Dia3JPA.repository;

import com.example.Dia3JPA.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

package com.example.Dia3JPA.service;

import com.example.Dia3JPA.model.Person;
import com.example.Dia3JPA.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    //Obtener todas las personas
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    //Obtener una persona por id
    public Optional<Person> getPersonById(Long id){
        return personRepository.findById(id);
    }

    //Guardar una persona
    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    //Eliminar una persona
    public void deletPerson(Long id){
        personRepository.deleteById(id);
    }

    //Actualizar persona
    public Person updatePerson(Long id, Person personDetails){
        Person person = personRepository.findById(id).orElseThrow();
        person.setName(personDetails.getName());
        person.setAge(personDetails.getAge());
        return personRepository.save(person);
    }
}

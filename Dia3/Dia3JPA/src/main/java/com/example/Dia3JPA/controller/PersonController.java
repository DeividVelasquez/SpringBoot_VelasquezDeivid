package com.example.Dia3JPA.controller;

import com.example.Dia3JPA.model.Person;
import com.example.Dia3JPA.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    //Obtener todas las personas
    //LocalHost:8080/api/persons con verbo GET
    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPerson();
    }
    
    //Obtener a una persona por ID
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id).orElseThrow();
    }

    // Crear una persona
    // LocalHost:8080/api/persons con verbo POST
    // {
    // "name": "Andres",
    // "age": 25
    // {

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    // Actualizar persona
    // LocalHost:8080/api/persons/1 con verbo PUT
    // {
    // "name": "Pastrana",
    // "age": 28
    // {
    @PutMapping("/{id}")
    public Person updatePerson (@PathVariable Long id, @RequestBody Person person){
        return personService.updatePerson(id, person);
    }

    // Eliminar persona.
    @DeleteMapping("/{id}")
    public void deletPerson(@PathVariable Long id){
        personService.deletPerson(id);
    }

}

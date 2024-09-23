package com.example.Restaurante.controller;

import com.example.Restaurante.model.Plato;
import com.example.Restaurante.service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dish")
public class PlatoController {

    @Autowired
    private PlatoService platoService;

    //Obtener todos los platos
    @GetMapping
    public List<Plato> getAllPlato() {
        return platoService.getAllPlatos();
    }

    //Guardar platos
    @PostMapping
    public Plato createPlato(@RequestBody Plato plato) {
        return platoService.savePlato(plato);
    }

    //Actualizar plato
    @PutMapping("/{id}")
    public Plato updatePlato(@PathVariable Long id, @RequestBody Plato plato) {
        return platoService.updatePlato(id, plato);
    }

    //Eliminar plato
    @DeleteMapping("/{id}")
    public void deletePlato(@PathVariable Long id) {
        platoService.deletePlato(id);
    }
}

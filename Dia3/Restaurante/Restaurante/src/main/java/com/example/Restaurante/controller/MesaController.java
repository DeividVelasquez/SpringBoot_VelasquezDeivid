package com.example.Restaurante.controller;

import com.example.Restaurante.model.Mesa;
import com.example.Restaurante.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/table")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    //Obtener estado de mesas
    @GetMapping
    public List<Mesa> getAllMesa() {
        return mesaService.getAllMesas();
    }

    //Guardar registro de mesa
    @PostMapping
    public Mesa createMesa(@RequestBody Mesa mesa) {
        return mesaService.saveMesa(mesa);
    }

    //Actualizar estado de mesa
    @PutMapping("/{id}")
    public Mesa updateMesa(@PathVariable Long id, @RequestBody Mesa mesa) {
        return mesaService.updateMesa(id, mesa);
    }

    //Eliminar estado de mesa
    @DeleteMapping("/{id}")
    public void deleteMesa(@PathVariable Long id) {
        mesaService.deleteMesa(id);
    }
}

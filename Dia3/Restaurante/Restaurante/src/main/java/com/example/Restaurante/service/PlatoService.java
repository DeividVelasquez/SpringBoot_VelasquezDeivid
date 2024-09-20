package com.example.Restaurante.service;

import com.example.Restaurante.model.Plato;
import com.example.Restaurante.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoService {

    @Autowired
    private PlatoRepository platoRepository;

    //obtener todos los platos
    public List<Plato> getAllPlatos() {
        return platoRepository.findAll();
    }

    //Guardar plato
    public Plato savePlato(Plato plato) {
        return platoRepository.save(plato);
    }

    //Actualizar plato
    public Plato updatePlato(Long id, Plato platoDetails) {
        Plato plato = platoRepository.findById(id).orElseThrow();
        plato.setNombre(platoDetails.getNombre());
        plato.setPrecio(platoDetails.getPrecio());
        plato.setDisponibilidad(platoDetails.getDisponibilidad());
        return platoRepository.save(plato);
    }

    //Eliminar plato
    public void deletePlato(Long id) {
        platoRepository.deleteById(id);
    }
}

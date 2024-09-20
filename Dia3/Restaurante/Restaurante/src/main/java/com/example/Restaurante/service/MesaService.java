package com.example.Restaurante.service;

import com.example.Restaurante.model.Mesa;
import com.example.Restaurante.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService {

    @Autowired
    private MesaRepository mesaRepository;

    //Obtener estado de mesas
    public List<Mesa> getAllMesas(){
        return mesaRepository.findAll();
    }

    //registrar mesas
    public Mesa saveMesa(Mesa mesa){
        return mesaRepository.save(mesa);
    }

    //Actualizar estado
    public Mesa updateMesa(Long id, Mesa mesaDetails){
        Mesa mesa = mesaRepository.findById(id).orElseThrow();
        mesa.setOcupada(mesaDetails.getOcupada());
        return mesaRepository.save(mesa);
    }

    //Eliminar registro
    public void deleteMesa(Long id){
        mesaRepository.deleteById(id);
    }
}

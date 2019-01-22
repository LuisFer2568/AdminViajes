package com.aeropuerto.adminaeropuerto.services;

import com.aeropuerto.adminaeropuerto.repository.IPasajerosRepository;
import com.aeropuerto.adminaeropuerto.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroDao {

    @Autowired
    IPasajerosRepository iPasajerosRepository;

    public List<Pasajero> findAllPasajeros(){
        return iPasajerosRepository.findAll();
    }
}

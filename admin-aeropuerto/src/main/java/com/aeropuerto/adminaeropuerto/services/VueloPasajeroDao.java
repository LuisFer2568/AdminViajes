package com.aeropuerto.adminaeropuerto.services;

import com.aeropuerto.adminaeropuerto.repository.IPasajerosRepository;
import com.aeropuerto.adminaeropuerto.utileria.Pasajero;
import com.aeropuerto.adminaeropuerto.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloPasajeroDao {


    @Autowired
    IPasajerosRepository iPasajerosRepository;

    public boolean postPasajero(int idVuelo, Pasajero pasajero) {
        pasajero.setVuelo(new Vuelo(idVuelo));
        return iPasajerosRepository.save(pasajero) !=null?true:false;

    }

    public List<Pasajero> personasPorVuelo(int idVuelo) {
        return iPasajerosRepository.findByVuelo_IdVuelo(idVuelo);
    }
}

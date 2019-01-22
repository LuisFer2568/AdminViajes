package com.aeropuerto.adminaeropuerto.services;

import com.aeropuerto.adminaeropuerto.repository.IVueloRepository;
import com.aeropuerto.adminaeropuerto.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class VuelosDao {

    @Autowired
    IVueloRepository iVueloRepository;

    public List<Vuelo> findAllVuelos() {
        return iVueloRepository.findAll();
    }

    public Vuelo findIdVuelos(Integer idVuelo){
        return iVueloRepository.findById(idVuelo).get();
    }

    public boolean posteaVuelo(Vuelo vuelo) {
        if (iVueloRepository.save(vuelo) != null) {
            return true;
        } else {
            return false;
        }
    }


    public boolean updateVueloorId(int idVuelo, Vuelo vuelo) {
        vuelo.setIdVuelo(idVuelo);
        return iVueloRepository.save(vuelo) != null ? true : false;
    }
}

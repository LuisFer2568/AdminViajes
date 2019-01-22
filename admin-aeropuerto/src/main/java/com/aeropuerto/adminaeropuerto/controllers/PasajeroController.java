package com.aeropuerto.adminaeropuerto.controllers;

import com.aeropuerto.adminaeropuerto.services.PasajeroDao;
import com.aeropuerto.adminaeropuerto.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PasajeroController {

    @Autowired
    PasajeroDao pasajeroDao;

    @RequestMapping(value="/pasajero", method = RequestMethod.GET)
    public List<Pasajero> getPasajeros(){
        return pasajeroDao.findAllPasajeros();
    }
}

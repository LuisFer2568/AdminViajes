package com.aeropuerto.adminaeropuerto.controllers;


import com.aeropuerto.adminaeropuerto.services.VueloPasajeroDao;
import com.aeropuerto.adminaeropuerto.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelo")
public class VueloPasajerController {

    @Autowired
    VueloPasajerController vueloPasajerController;

    @Autowired
    VueloPasajeroDao vueloPasajeroDao;

    @RequestMapping(value = ("/{idVuelo}/pasajero/{iPasajero}"), method = RequestMethod.GET)
    public Pasajero getUnPasajeroDeVuelo(){
        return null;
    }

    @RequestMapping(value = ("/{idVuelo}/pasajero"), method = RequestMethod.GET)
    public List<Pasajero> getPasajeroDeVuelo(@PathVariable int idVuelo){
        return vueloPasajeroDao.personasPorVuelo(idVuelo);

    }

    @RequestMapping(value = ("/{idVuelo}/pasajero"), method = RequestMethod.POST)
    public boolean postPasajerosDeVuelo (@PathVariable("idVuelo")int idVuelo, @RequestBody Pasajero pasajero){
        return vueloPasajeroDao.postPasajero(idVuelo,pasajero);
    }
}

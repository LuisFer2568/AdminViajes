package com.aeropuerto.adminaeropuerto.controllers;

import com.aeropuerto.adminaeropuerto.services.VuelosDao;
import com.aeropuerto.adminaeropuerto.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vuelo")
public class VueloController {

    @Autowired
    VuelosDao vuelosDao;

    @RequestMapping("")
    public List<Vuelo> getVuelos(){
        return vuelosDao.findAllVuelos();
    }

    @RequestMapping("/{idVuelo}")
    public Vuelo getVuelo(@PathVariable("idVuelo") int idVuelo){
        return vuelosDao.findIdVuelos(idVuelo);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public boolean postVuelos(@RequestBody Vuelo vuelo){
        return vuelosDao.posteaVuelo(vuelo);
    }

    @RequestMapping(value = "/{idVuelo}", method = RequestMethod.PUT)
    public  boolean putVuelo(@PathVariable("idVuelo") int idVuelo, @RequestBody Vuelo vuelo){
        return vuelosDao.updateVueloorId(idVuelo,vuelo);
    }


}

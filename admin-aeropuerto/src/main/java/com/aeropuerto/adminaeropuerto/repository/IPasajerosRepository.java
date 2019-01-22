package com.aeropuerto.adminaeropuerto.repository;

import com.aeropuerto.adminaeropuerto.utileria.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPasajerosRepository extends JpaRepository<Pasajero,Integer> {

    List<Pasajero> findByVuelo_IdVuelo(Integer idVuelo);


}

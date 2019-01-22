package com.aeropuerto.adminaeropuerto.utileria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

import javax.persistence.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vuelo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVuelo;

    @Column
    private String aeropuerto;

    @Column
    private String aerolinea;

    @Column
    private String ruta;

    public Vuelo(int idVuelo){
        this.idVuelo = idVuelo;
    }
}

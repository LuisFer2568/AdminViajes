package com.aeropuerto.adminaeropuerto.utileria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBoleto;

    @Column
    private String nombre;

    @Column
    private String asiento;

    @ManyToOne
    private Vuelo vuelo;
}

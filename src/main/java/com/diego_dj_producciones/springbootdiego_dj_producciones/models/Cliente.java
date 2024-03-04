package com.diego_dj_producciones.springbootdiego_dj_producciones.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String tipo_evento;
    private String cantidad_invitados;
    @Column(columnDefinition = "Text")
    private String descripcion;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_creacion;
    private String nombre_archivo_imagen;




}

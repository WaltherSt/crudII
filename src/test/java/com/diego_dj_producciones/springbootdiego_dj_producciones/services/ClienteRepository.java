package com.diego_dj_producciones.springbootdiego_dj_producciones.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego_dj_producciones.springbootdiego_dj_producciones.models.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente,Integer>
{

}

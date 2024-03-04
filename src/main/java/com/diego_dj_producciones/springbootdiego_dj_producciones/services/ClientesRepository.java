package com.diego_dj_producciones.springbootdiego_dj_producciones.services;
import com.diego_dj_producciones.springbootdiego_dj_producciones.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientesRepository extends JpaRepository<Cliente,Integer> {
}

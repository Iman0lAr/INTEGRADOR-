
package com.example.demo.Repositorio;

import com.example.demo.Entidades.Representante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioRepresentante extends JpaRepository<Representante, Integer>  {
    
           @Query(value = "CALL usp_Insertar_Representante(:new_id_Persona,:new_id_discapacitado,:new_copia_dni)", nativeQuery = true)
    Representante insertarRepresentante(
            @Param("new_id_Persona") Integer new_id_Persona,
            @Param("new_id_discapacitado") Integer new_id_discapacitado,
            @Param("new_copia_dni") byte[] new_copia_dni);
    
    @Query(value = "CALL usp_Obtener_Info_Representante(:codigo_Repre)", nativeQuery = true)
    Representante obtenerRepre(
            @Param("codigo_Repre") Integer codigo_Repre);
}

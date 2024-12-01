
package com.example.demo.Repositorio;

import com.example.demo.Entidades.Discapacitado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDiscapacitado extends JpaRepository<Discapacitado, Integer>  {
    
@Query(value = "CALL usp_Insertar_Discapacitado(:new_id_Persona, :new_copia_dni)", nativeQuery = true)
Discapacitado insertarDiscapacitado(
        @Param("new_id_Persona") Integer new_id_Persona,
        @Param("new_copia_dni") byte[] new_copia_dni);

    
}

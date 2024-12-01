
package com.example.demo.Repositorio;

import com.example.demo.Entidades.Discapacitado_Representane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDis_Repre extends JpaRepository<Discapacitado_Representane, Integer> {
    
}

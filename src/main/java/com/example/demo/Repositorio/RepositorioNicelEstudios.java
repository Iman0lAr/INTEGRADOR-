
package com.example.demo.Repositorio;

import com.example.demo.Entidades.NivelEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioNicelEstudios extends JpaRepository<NivelEstudio, Integer> {
    
}

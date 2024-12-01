
package com.example.demo.Repositorio;

import com.example.demo.Entidades.DocumentoDeIdentidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDocuementoIden extends JpaRepository<DocumentoDeIdentidad, Integer>  {
    
}

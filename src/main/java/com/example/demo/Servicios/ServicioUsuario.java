
package com.example.demo.Servicios;


import com.example.demo.Entidades.Usuario;
import com.example.demo.Repositorio.RepositorioUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {
    
    @Autowired
    private RepositorioUsuario repositorioUsuario;
    
    public Usuario login(String uss,String contra){
    
      return  repositorioUsuario.InicioSesion(uss, contra);
    }
    
    public Usuario CrearUsuario(Usuario usuario,String tipo,Integer id_persona){
        return  repositorioUsuario.CrearUsario(usuario.getUsuario(), usuario.getContraseña(), tipo,id_persona);
    }
    
    public List<Usuario> obtenerUsuarios(){
        return repositorioUsuario.findAll();
    }
    
}

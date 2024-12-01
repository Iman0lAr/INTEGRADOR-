
package com.example.demo.Controladores;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerFormPC {
    
    
    @GetMapping("/tramitePC")
    public String mostrarFormPc(HttpSession sesion){
        if(sesion.getAttribute("uss")==null){
            return "redirect:/index";
        }
        return "FormProgramaContigo";
    }
    
}

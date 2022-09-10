package com.labo4.clase1SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//para que esta clase contenga endpoints, se la debe anotar como rest controller
// se importa también esta clase rest de Spring

@RestController
public class ControladorHola {
    //Quiero que se ejecute cuando pidan la url por GET
    
    @GetMapping("/")
    public String Hola(){
        return "Hola Mundo!";
    }
    
}

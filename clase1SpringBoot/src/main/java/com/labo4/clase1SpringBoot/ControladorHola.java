package com.labo4.clase1SpringBoot;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//para que esta clase contenga endpoints, se la debe anotar como rest controller
// se importa también esta clase rest de Spring

@RestController
public class ControladorHola {
    //Quiero que se ejecute cuando pidan la url por GET
    
    @GetMapping("/")
    public String Hola(){
        return "Hola Mundo, cómo andan! jajajaja";
    }
    
    @GetMapping("/numero")
    public int numero(){
        return new Random().nextInt(1000);
    }
    
    @GetMapping("/numeros")
    public int[] numeros(){
        return new Random().ints(100, 0, 10000).toArray();
    }
}

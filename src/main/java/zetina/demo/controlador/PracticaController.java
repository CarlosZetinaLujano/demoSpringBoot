package zetina.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticaController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hola Mundo";
    }
}

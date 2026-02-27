package dev.felpus.CadastroDePiratas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PirataController {

    @GetMapping("/msg")
    public String boasVindas(){
        return "Primeira mensagem dessa rota";
    }
}
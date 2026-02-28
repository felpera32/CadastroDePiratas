package dev.felpus.CadastroDePiratas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/msg")
    public String boasVindas(){
        return "Primeira mensagem dessa rota";
    }
}
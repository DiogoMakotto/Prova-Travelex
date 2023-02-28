package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.model.dto.DadosIMC;
import br.com.confidencecambio.javabasico.model.service.ResultadoIMC;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IMCController {
    @PostMapping("/imc") //calcularIMC é definido como um serviço que recebe os dados de entrada via POST na URL: /imc
    public ResultadoIMC calcularIMC(@RequestBody DadosIMC dados) {
        double imc = dados.getPeso() / Math.pow(dados.getAltura(), 2);
        ResultadoIMC resultado = new ResultadoIMC();
        resultado.setImc(imc);
        return resultado;
    } //executando um POST no postman, com o corpo em JSON ex: {"peso":"80", "altura":"1.80"} ele retorna o IMC = {"imc": 24.691358024691358}
}

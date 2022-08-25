package com.example.cuadratica.controller;

import java.util.List;

public class ApiCuadratica {
    private String hora;
    private List<Integer> valoresUsados;
    private String resultadoRaiz;
    private String resultadoNumerador;
    private String resultadoDenominador;
    private String resultado;
    
    public ApiCuadratica(String hora, List<Integer> valoresUsados, String string, String string2,
            String string3, String resultado) {
        this.hora = hora;
        this.valoresUsados = valoresUsados;
        this.resultadoRaiz = string;
        this.resultadoNumerador = string2;
        this.resultadoDenominador = string3;
        this.resultado = resultado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Integer> getValoresUsados() {
        return valoresUsados;
    }

    public void setValoresUsados(List<Integer> valoresUsados) {
        this.valoresUsados = valoresUsados;
    }

    public String getResultadoRaiz() {
        return resultadoRaiz;
    }

    public void setResultadoRaiz(String resultadoRaiz) {
        this.resultadoRaiz = resultadoRaiz;
    }

    public String getResultadoNumerador() {
        return resultadoNumerador;
    }

    public void setResultadoNumerador(String resultadoNumerador) {
        this.resultadoNumerador = resultadoNumerador;
    }

    public String getResultadoDenominador() {
        return resultadoDenominador;
    }

    public void setResultadoDenominador(String resultadoDenominador) {
        this.resultadoDenominador = resultadoDenominador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }



    
}

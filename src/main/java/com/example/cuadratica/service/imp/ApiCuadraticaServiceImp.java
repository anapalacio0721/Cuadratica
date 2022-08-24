package com.example.cuadratica.service.imp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.cuadratica.CuadraticaApplication;
import com.example.cuadratica.controller.ApiCuadratica;
import com.example.cuadratica.service.ApiCuadraticaService;

public class ApiCuadraticaServiceImp implements ApiCuadraticaService{

    @Override
    public ApiCuadratica resultApiCuadratica() {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        //System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds);
        int a = hours % 10;
        int b = hours % 10;
        int c = hours % 10;
        String hora = hours  + ":"+ minutes +":"+seconds;
        List<Integer> valoresUsados = new ArrayList<>();
        valoresUsados.add(a);
        valoresUsados.add(b);
        valoresUsados.add(c);
        Integer operacionRaiz = b*b - 4*a*c;
        String resultadoDenominador= String.valueOf(2*a);
        if (operacionRaiz < 0) {
            return new ApiCuadratica(
                hora, 
                valoresUsados, 
                String.valueOf(operacionRaiz),
                "NO es posible obtener, por que la raiz es negativa", 
                resultadoDenominador, 
                "No se puede, por que raiz negativa");
        }
        if (operacionRaiz == 0 ) {
            return new ApiCuadratica(
                hora, 
                valoresUsados, 
                "NO es posible obtener, por que la raiz cuadrada de 0 no existe",
                "NO es posible obtener, por que la raiz cuadrada de 0 no existe", 
                resultadoDenominador, 
                "No se puede, por que raiz cuadrada de 0 no existe");
        
        }
        if (operacionRaiz > 0 ) {
            return new ApiCuadratica(
                hora, 
                valoresUsados, 
                operacionRaiz,
                resultadoNumerador,
                resultadoDenominador, 
                resultado);
        }
    return null;
    }
}

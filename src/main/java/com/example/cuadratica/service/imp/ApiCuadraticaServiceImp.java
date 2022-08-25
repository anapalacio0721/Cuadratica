package com.example.cuadratica.service.imp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cuadratica.controller.ApiCuadratica;
import com.example.cuadratica.service.ApiCuadraticaService;

@Service
public class ApiCuadraticaServiceImp implements ApiCuadraticaService{

    @Override
    public ApiCuadratica resultApiCuadratica() {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        //System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds);
        int a = hours % 10;
        int b = minutes % 10;
        int c = seconds % 10;
        String hora = hours  + ":"+ minutes +":"+seconds;
        List<Integer> valoresUsados = new ArrayList<>();
        valoresUsados.add(a);
        valoresUsados.add(b);
        valoresUsados.add(c);
        Integer operacionRaiz = b*b - 4*a*c;
        Integer resultadoDenominador= 2*a;
        double resultadoNumerador = (b *(-1)) + Math.sqrt(operacionRaiz);
        double resultado = resultadoNumerador / resultadoDenominador;
       if(operacionRaiz < 0 && resultadoDenominador != 0){
            return new ApiCuadratica(
                hora, 
                valoresUsados, 
                String.valueOf(operacionRaiz),
                "NO es posible obtener, por que la raiz es negativa", 
                String.valueOf(resultadoDenominador), 
                "No se puede, por que raiz negativa");
        }
        if (operacionRaiz < 0 && resultadoDenominador == 0 ) {
            return new ApiCuadratica(
                hora, 
                valoresUsados, 
                String.valueOf(operacionRaiz),
                "NO es posible obtener, por que la raiz es negativa", 
                "NO existe por que denominador no existe", 
                "No se puede, por que raiz cuadrada de 0 no existe");
        
        }
        if (operacionRaiz > 0 && resultadoDenominador == 0) {
            return new ApiCuadratica(
                hora, 
                valoresUsados, 
                String.valueOf(operacionRaiz),
                String.valueOf(resultadoNumerador),
                "resultado no se pudo por que el denominador es igual 0", 
                "No es posible realizar la division sobre 0");
        }
        return new ApiCuadratica(
                hora, 
                valoresUsados, 
                String.valueOf(operacionRaiz),
                String.valueOf(resultadoNumerador),
                String.valueOf(resultadoDenominador), 
                String.valueOf(resultado));
    }
}

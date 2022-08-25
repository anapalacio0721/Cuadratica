package com.example.cuadratica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cuadratica.service.ApiCuadraticaService;


@RestController
@RequestMapping("/cuadratica")
public class ApiCuadraticaController {
    private final ApiCuadraticaService objCuadraticaService;

    public ApiCuadraticaController(@Autowired ApiCuadraticaService x)
    // inyecta las dependencias
    {
        this.objCuadraticaService = x;
    }

    @GetMapping
    public ResponseEntity<ApiCuadratica> serieCalculada() {
        return ResponseEntity.ok(objCuadraticaService.resultApiCuadratica());
    }
}
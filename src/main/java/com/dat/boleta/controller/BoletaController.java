package com.dat.boleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dat.boleta.dto.BoletaDTO;
import com.dat.boleta.service.BoletaService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/dac")
public class BoletaController {
	
	@Autowired
	private BoletaService boletaImpl;
	
	@RequestMapping("/bol")
	public ResponseEntity<BoletaDTO> obtenerBoleta(){
		Gson gson = new Gson();
		String json = gson.toJson(boletaImpl.getBoleta());		
		System.out.println(json);
		return null;
		//conexion(resp);
		//return ResponseEntity.ok(boletaImpl.getBoleta());
	}
	

}

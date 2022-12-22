package com.dat.boleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dat.boleta.dto.BoletaDTO;
import com.dat.boleta.service.BoletaService;

@RestController
@RequestMapping("/dac")
public class BoletaController {
	
	@Autowired
	private BoletaService boletaImpl;
	
	@RequestMapping("/bol")
	public ResponseEntity<BoletaDTO> obtenerBoleta(){
		return ResponseEntity.ok(boletaImpl.getBoleta());
	}
	

}

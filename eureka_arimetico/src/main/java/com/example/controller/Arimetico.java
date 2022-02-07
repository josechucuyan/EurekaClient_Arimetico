package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Arimetico {
	@GetMapping("/suma")
	public String sumar(@RequestParam("Num1") String Num1,@RequestParam("Num2") String Num2) {
		String suma = "";
		
		int numero = Integer.parseInt(Num1) + Integer.parseInt(Num2);
		
		suma = "" + Num1 + " + " + Num2 + " = " + numero;
		
		return suma;
	}
}

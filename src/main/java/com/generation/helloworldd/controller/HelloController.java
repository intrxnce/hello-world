package com.generation.helloworldd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello, World!</b>";
	}
	
	@GetMapping("/bsms")
	public String bsms() {
		return "<b>BSMs da Generation: responsabilidade pessoal, mentalidade de crescimento, orientação ao futuro, persistência, comunicação, orientação aos detalhes, trabalho em equipe e proatividade.";
	}
	
	@GetMapping("/obaps")
	public String obaps() {
		return "<b>Objetivos de aprendizagem da semana: Meus objetivos de aprendizagem para esta semana são: recuperar as lacunas que ficaram da semana passada, deixar a matéria dessa semana em dia e estudar por fora, além de aplicar meu conhecimento em projetos.";
	}
}

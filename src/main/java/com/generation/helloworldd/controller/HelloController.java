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
		return "<b>BSMs da Generation: /-Responsabilidade pessoal; /-Mentalidade de crescimento; /-Orientação ao futuro; /-Persistência; /-Comunicação; /-Orientação aos detalhes; /-Trabalho em equipe; /-Proatividade.";
	}
	
	@GetMapping("/obaps")
	public String obaps() {
		return "<b>Objetivos de aprendizagem da semana:<br /Meus objetivos de aprendizagem para esta semana são: recuperar as lacunas que ficaram da semana passada, deixar a matéria dessa semana em dia e estudar por fora, além de aplicar meu conhecimento em projetos.</b>";
	}
}

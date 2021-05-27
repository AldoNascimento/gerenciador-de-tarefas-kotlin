package br.com.devaria.projetos.gerenciadortarefas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GerenciadorTarefasApplication

fun main(args: Array<String>) {
	runApplication<GerenciadorTarefasApplication>(*args)
}


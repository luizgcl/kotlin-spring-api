package br.com.luizgcl.pedeai

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories
@SpringBootApplication
class PedeaiApplication

fun main(args: Array<String>) {
    runApplication<PedeaiApplication>(*args)
}

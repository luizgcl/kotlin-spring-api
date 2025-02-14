package br.com.luizgcl.pedeai.user.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Min
import java.time.LocalDate

data class CreateUserDto(
    val username: String,
    val password: String,
    val birthDate: LocalDate,
    @Email val email: String,
    @Min(11) val documentNumber: String
) {
}
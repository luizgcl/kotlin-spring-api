package br.com.luizgcl.pedeai.user.dto

import java.time.LocalDate

data class UserResponseDto(
    val username: String,
    val birthDate: LocalDate,
) {
}
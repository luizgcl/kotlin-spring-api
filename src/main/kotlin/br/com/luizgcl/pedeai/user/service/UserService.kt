package br.com.luizgcl.pedeai.user.service

import br.com.luizgcl.pedeai.user.User
import br.com.luizgcl.pedeai.user.dto.CreateUserDto
import br.com.luizgcl.pedeai.user.dto.UserResponseDto
import br.com.luizgcl.pedeai.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {

    fun createUser(dto: CreateUserDto): UserResponseDto {
        val user = User(
            username = dto.username,
            password = dto.password,
            email = dto.email,
            birthDate = dto.birthDate,
            documentNumber = dto.documentNumber,
        )

        userRepository.save(user)

        return UserResponseDto(
            username = user.username,
            birthDate = user.birthDate,
        )
    }

}
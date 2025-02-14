package br.com.luizgcl.pedeai.user

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.Getter
import lombok.Setter
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.UUID

@Getter
@Setter
class User(
    val username: String,
    @Column(unique = true)
    val email: String,
    @Column(name= "password_hash")
    val password: String,
    @Column(name = "birth_date")
    val birthDate: LocalDateTime,
    @Column(name = "document_number",unique = true)
    val documentNumber: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = null

}
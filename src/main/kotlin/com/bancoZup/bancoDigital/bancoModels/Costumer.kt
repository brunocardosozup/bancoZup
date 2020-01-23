package com.bancoZup.bancoDigital.bancoModels

import org.aspectj.weaver.Iterators.array
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class Costumer(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        val id: Int,
        @NotBlank(message = "The field name is required!")
        val name: String,
        @NotBlank(message = "The field cpf is required")
        val cpf: String,
        @NotBlank(message = "The field numberPhone is required")
        val numberFone: Int,

        @NotBlank(message = "The field account is required")
//        @JoinTable(name = "account", joinColumns = arrayOf<JoinColumn>(JoinColumn(name = "id")))

        @OneToOne
        var account: Account? = null


)



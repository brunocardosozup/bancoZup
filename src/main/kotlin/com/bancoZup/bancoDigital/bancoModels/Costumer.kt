package com.bancoZup.bancoDigital.bancoModels

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class Costumer(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        @NotBlank(message = "The field name is required!")
        var name: String,
        @NotBlank(message = "The field cpf is required")
        var cpf: String,
        @NotBlank(message = "The field numberPhone is required")
        var numberFone: Int,

        @NotBlank(message = "The field account is required")
        @OneToOne var account: Account? = null

)
//
//@OneToOne(mappedBy = "costumer")
//lateinit var account: Account
//

//@OneToOne(mappedBy = "cliente")






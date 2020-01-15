package com.bancoZup.bancoDigital.bancoModels

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
class Cliente(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", updatable = false, nullable = false)
        var id: Int,

        @NotBlank(message = "Campo nome obrigatório")
        var nome: String,

        @NotBlank(message = "")
        var cpf : String,

        @NotBlank
        var nDTelefone: String,

        var conta: Conta
)

@OneToOne(mappedBy = "cliente")
lateinit var contaT : Conta


//@OneToOne(mappedBy = "cliente")






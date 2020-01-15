package com.bancoZup.bancoDigital.bancoModels

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
class Conta (


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    var id : Int,

    @NotBlank(message = "O campo Nº conta é obrigatório")
    var nConta : String,

    @NotBlank(message = "O campo de saldo é obrigatório")
    var saldo : Double,


    var cliente: Cliente

)

@OneToOne(cascade = [CascadeType.ALL])
@JsonIgnoreProperties("conta")
lateinit var cliente: Cliente














//
//@OneToOne(cascade = [CascadeType.ALL])
//@JsonIgnoreProperties("conta")
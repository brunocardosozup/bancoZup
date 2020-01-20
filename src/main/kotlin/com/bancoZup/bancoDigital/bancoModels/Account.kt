package com.bancoZup.bancoDigital.bancoModels

import javax.persistence.*
import javax.validation.constraints.NotBlank

//these are the attributes of the class and constructor
@Entity
data class Account(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        @NotBlank(message = "The field balance is required!")
        var balance: Double,


        @OneToOne var costumer: Costumer
)




    /*Método de depositar algum valor
    fun deposita(valor : Double){
contaT.saldo += valor
    }

     */



//
//@OneToOne(cascade = [CascadeType.ALL])
//@JsonIgnoreProperties("conta")
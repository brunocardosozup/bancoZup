package com.bancoZup.bancoDigital.bancoModels

import javax.persistence.*
import javax.validation.constraints.NotBlank

//these are the attributes of the class and constructor
@Entity
data class Account(


//        @GeneratedValue(strategy = GenerationType.IDENTITY)


        @Id
        val id: Int,

        @NotBlank(message = "The field balance is required!")
        val balance: Double,


        @OneToOne val costumer: Costumer
)


/*Método de depositar algum valor
fun deposita(valor : Double){
contaT.saldo += valor
}

 */


//
//@OneToOne(cascade = [CascadeType.ALL])
//@JsonIgnoreProperties("conta")
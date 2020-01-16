package com.bancoZup.bancoDigital.bancoModels

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*
import javax.persistence.criteria.CriteriaBuilder
import javax.validation.constraints.NotBlank

@Entity
class Account(


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,
        @NotBlank(message = "The field numberAccount is required!")
        var numberAccount: Long,
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
package com.bancoZup.bancoDigital.services

import com.bancoZup.bancoDigital.bancoModels.Account
import com.bancoZup.bancoDigital.bancoModels.Costumer
import com.bancoZup.bancoDigital.repositories.CostumerRepository
import org.springframework.stereotype.Service

@Service
class CostumerService(var costumerRepository: CostumerRepository) {

    fun findAll(): kotlin.collections.List<Costumer> {
        return costumerRepository.findAll().toList()

    }

    fun createCostumer(costumer: Costumer): Costumer {
        return costumerRepository.save(costumer)
    }
}





































//    }
////  Método sacar
//fun withdraw(value : Double) : Boolean{
//    lateinit var account : Account
//    if(account.balance < value){
//        return false
//    }


//fun getValueMoney(valor: Double): Boolean {
//    if (account.balance < valor) {
//        return false
//    }
//    else{
//        account.balance =  account.balance - valor
//        return true
//    }


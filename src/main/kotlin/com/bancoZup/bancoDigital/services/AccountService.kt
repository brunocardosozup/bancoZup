    package com.bancoZup.bancoDigital.services

import com.bancoZup.bancoDigital.bancoModels.Account
import com.bancoZup.bancoDigital.bancoModels.Costumer
import com.bancoZup.bancoDigital.repositories.AccountRepository
import com.bancoZup.bancoDigital.repositories.CostumerRepository
import org.springframework.stereotype.Service
import java.util.*


    @Service
class AccountService(var accountRepository: AccountRepository, var costumerRepository: CostumerRepository) {

        val random = Random()


        fun createAccount(costumer: Costumer, balance: Double){
            if (costumer.id != null) {
                val account = Account(id = random.nextInt(999), balance = balance, costumer = costumer)
                accountRepository.save(account)
            } else {

                "sorry try again, costumer not found"
            }

        }


        fun findAllAccount():kotlin.collections.List<Account>{
            return accountRepository.findAll().toList()
        }
    }





































//    fun save(conta: Conta, cliente: Cliente): String {
//        conta.cliente
//        contaRepository.save(conta)
//
//        val res: String = "Success created account!"
//        return res
//// Não é totalmente necessário o retorno de uma string, posso fazer com que no controller seja, um http.ok de retorno 200.
//    }
//
//
//}


//    fun exibirMyContas(): kotlin.collections.List<Conta> {
//
//        return contaRepository.findAll().toList()
//    }
//
//    fun totalDeContas(): Long {
//        return contaRepository.count()
//    }
//
//    fun salvarContasApiRest(conta: Conta) {
//        contaRepository.save(conta)
//    }
//
//    open fun atualizar(id: Int, conta: Conta) {
//        conta.id
//        contaRepository.save(conta)
//    }
//
//    open fun deletContId(id: Int) {
//        contaRepository.deleteById(id)
//    }
//
//    open fun getContaById(id: Int): Optional<Conta>? {
//        if (contaRepository.existsById(id)) {
//            return contaRepository.findById(id)
//        }
//        return null
//    }
//
//}
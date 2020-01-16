    package com.bancoZup.bancoDigital.services

import com.bancoZup.bancoDigital.repositories.AccountRepository
import com.bancoZup.bancoDigital.repositories.CostumerRepository
import org.springframework.stereotype.Service


    @Service
class AccountService(var contaRepository: AccountRepository, var costumerRepository: CostumerRepository) {

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
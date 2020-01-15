package com.bancoZup.bancoDigital.services

import com.bancoZup.bancoDigital.bancoModels.Cliente
import com.bancoZup.bancoDigital.bancoModels.Conta
import com.bancoZup.bancoDigital.repositories.ClienRepository
import com.bancoZup.bancoDigital.repositories.ContaRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ContaService(var contaRepository: ContaRepository, var clienRepository: ClienRepository) {

    fun save(conta: Conta, cliente: Cliente): String {
        conta.cliente
        contaRepository.save(conta)

        val res: String = "Success created account!"
        return res

    }

    fun exibirMyContas(): kotlin.collections.List<Conta> {
        return contaRepository.findAll().toList()
    }

    fun totalDeContas(): Long {
        return contaRepository.count()
    }

    fun salvarContasApiRest(conta: Conta) {
        contaRepository.save(conta)
    }

    open fun atualizar(id: Int, conta: Conta) {
        conta.id
        contaRepository.save(conta)
    }

    open fun deletContId(id: Int) {
        contaRepository.deleteById(id)
    }

    open fun getContaById(id: Int): Optional<Conta>? {
        if (contaRepository.existsById(id)) {
            return contaRepository.findById(id)
        }
        return null
    }

}
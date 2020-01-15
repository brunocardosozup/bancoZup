package com.bancoZup.bancoDigital.services

import com.bancoZup.bancoDigital.bancoModels.Cliente
import org.springframework.stereotype.Service

@Service
class ClienteService(var clienteService: ClienteService) {

    fun findAll() : kotlin.collections.List<Cliente>{
        return clienteService.findAll().toList()

    }
}
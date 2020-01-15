package com.bancoZup.bancoDigital.repositories

import com.bancoZup.bancoDigital.bancoModels.Cliente
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienRepository : CrudRepository<Cliente, Int> {
}


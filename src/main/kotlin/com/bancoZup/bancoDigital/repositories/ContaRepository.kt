package com.bancoZup.bancoDigital.repositories

import com.bancoZup.bancoDigital.bancoModels.Conta
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ContaRepository : CrudRepository<Conta, Int> {
}

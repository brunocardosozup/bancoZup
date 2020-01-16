package com.bancoZup.bancoDigital.repositories

import com.bancoZup.bancoDigital.bancoModels.Costumer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CostumerRepository : CrudRepository<Costumer, Int> {

}


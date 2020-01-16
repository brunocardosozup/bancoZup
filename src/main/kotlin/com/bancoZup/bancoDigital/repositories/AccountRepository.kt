package com.bancoZup.bancoDigital.repositories

import com.bancoZup.bancoDigital.bancoModels.Account
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : CrudRepository<Account, Int> {
}

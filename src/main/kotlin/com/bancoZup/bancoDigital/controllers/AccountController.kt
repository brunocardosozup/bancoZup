package com.bancoZup.bancoDigital.controllers

import com.bancoZup.bancoDigital.bancoModels.Account
import com.bancoZup.bancoDigital.bancoModels.Costumer
import com.bancoZup.bancoDigital.controllers.requests.CreateAccountRequest
import com.bancoZup.bancoDigital.services.CostumerService
import com.bancoZup.bancoDigital.services.AccountService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/bank")
class AccountController(var accountService: AccountService, var costumerService: CostumerService) {


    @PostMapping("/create/account")
    fun creatingAccount(@RequestBody request : CreateAccountRequest): Costumer {
        val costumer = costumerService.findByid(request.id)
        accountService.createAccount(costumer, request.balance)
        return costumer
    }


@GetMapping("/allAccount")
fun lookAllAccount() = accountService.findAllAccount()
}


























//    @PostMapping
//    fun criarConta(@RequestBody conta: Conta): ResponseEntity<Conta> {
//        return ResponseEntity.status(HttpStatus.CREATED).body(conta)
//    }
//
//@GetMapping
// fun getContas(): ResponseEntity<List<Conta>> {
//if(contaService.totalDeContas() > 0 ){
//    return ResponseEntity.ok(contaService.exibirMyContas())
//}
//    return ResponseEntity.noContent().build()
//}
//
//    @DeleteMapping("/{id}")
//    fun deleteBYId(@PathVariable id : Int) : ResponseEntity<Conta>{
//contaService.deletContId(id)
//        return ResponseEntity.ok().build()
//
//    }
//
//
//@GetMapping("/{id}")
//fun getMyAccountById(@PathVariable id: Int): ResponseEntity<Optional<Conta>> {
//    val conta : Optional<Conta>? = contaService.getContaById(id)
//    if(conta == null){
//        return ResponseEntity.notFound().build()
//    }else{
//        return ResponseEntity.ok(conta)
//    }
//}
//
//}
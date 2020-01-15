package com.bancoZup.bancoDigital.controllers

import com.bancoZup.bancoDigital.bancoModels.Conta
import com.bancoZup.bancoDigital.services.ClienteService
import com.bancoZup.bancoDigital.services.ContaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.persistence.Id

@RestController
@RequestMapping("/conta")
class ContaController(var contaService: ContaService, var clienteService: ClienteService) {

    @PostMapping
    fun criarConta(@RequestBody conta: Conta): ResponseEntity<Conta>{
return ResponseEntity.status(HttpStatus.CREATED).body(conta)
    }

@GetMapping
 fun getContas(): ResponseEntity<List<Conta>> {
if(contaService.totalDeContas() > 0 ){
    return ResponseEntity.ok(contaService.exibirMyContas())
}
    return ResponseEntity.noContent().build()
}

    @DeleteMapping("/{id}")
    fun deleteBYId(@PathVariable id : Int) : ResponseEntity<Conta>{
contaService.deletContId(id)
        return ResponseEntity.ok().build()

    }


@GetMapping("/{id}")
fun getMyAccountById(@PathVariable id: Int): ResponseEntity<Optional<Conta>> {
    val conta : Optional<Conta>? = contaService.getContaById(id)
    if(conta == null){
        return ResponseEntity.notFound().build()
    }else{
        return ResponseEntity.ok(conta)
    }
}

}
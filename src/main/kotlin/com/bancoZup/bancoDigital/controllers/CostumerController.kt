package com.bancoZup.bancoDigital.controllers

import com.bancoZup.bancoDigital.bancoModels.Costumer
import com.bancoZup.bancoDigital.services.CostumerService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/bank")
class CostumerController (var costumerService: CostumerService){


    @PostMapping("/create/costumer")
    fun creatingCostumer(@RequestBody costumer: Costumer): Costumer {
        costumerService.createCostumer(costumer)
        return costumer

    }

    @GetMapping("/allCostumer")
    fun lookAllCostumer() = costumerService.findAll()

}
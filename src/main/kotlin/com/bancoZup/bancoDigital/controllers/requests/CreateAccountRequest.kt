package com.bancoZup.bancoDigital.controllers.requests

import org.springframework.web.bind.annotation.PathVariable

data class CreateAccountRequest( val id : Int,@PathVariable val balance : Double) {


}
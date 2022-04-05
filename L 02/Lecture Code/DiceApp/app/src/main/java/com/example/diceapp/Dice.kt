package com.example.diceapp


// define Dice class to represent object properties and behaviours

class Dice(val sideNum : Int){

    fun roll() : Int {

        val range_dice = 1 .. sideNum

        return   range_dice.random()
    }

}
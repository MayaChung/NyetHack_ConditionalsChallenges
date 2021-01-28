package com.example.nyethack.conditionnals.challenges

import android.util.Log

class Game {
    val TAG="Game"
    fun main(args:Array<String>){
        val name="Frank"
//        var healthPoints=100
        var healthPoints=89
        val isBleesed=true
        val isImmortal=true
        //假設玩家比較走運而且健康值大於50 或者 天選之人 頭上出現綠光環 反之無
        val auraVisible=isBleesed && healthPoints>50 || isImmortal
        val auraColor=if(auraVisible)"Green" else "NONE"
//        println(auraColor)
        //玩家狀態
        println("(Aura: $auraColor)"+"(Blessed: ${if(isBleesed)"Yes" else "No"})")


//        val healthStatus = if (healthPoints == 100){
//            " is an excellent condition!"
//        }
//        else if (healthPoints in 90..99){
//            " has a few scratches"
//        }
//        else if (healthPoints in 75..89){
//            if (isBleesed){
//                " has some minor wounds but uis healing quite quickly"
//            }
//            " has some minor wounds."
//        }
//        else if (healthPoints in 15..74){
//            " looks prtty hurt!"
//        }
//        else{
//            " is in awful condition"
//        }
//        println(name+": "+healthStatus)

        val healthStatus =when(healthPoints){
            100 ->" is an excellent condition!"
            in 90..99 ->" has a few scratches"
            in 75..89 ->if (isBleesed){
                " has some minor wounds but uis healing quite quickly"
            }
            else{
                " has some minor wounds."
            }
            in 15..74 ->" looks prtty hurt!"
            else ->" is in awful condition"
        }
//        println(name+": "+healthStatus)
        println("$name $healthStatus")

        //當race種族 屬於人類 半身人 獸人.按照派別結成同盟
        val race="222"
        val faction = when (race){
            "dwarf" ->"keepers of the Nines"
            "gnome" ->"keepers"
            else -> "angle"
        }

    }
}
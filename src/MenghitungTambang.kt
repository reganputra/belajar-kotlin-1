fun main(args: Array<String>) {
    val treasure = arrayOf("Diamond","Gold","Zonk" ,"Copper","Zonk" ,"Silver", "Diamond", "Zonk","Copper" ,"Zonk","Gold")

    var gold = 0
    var diamond = 0

    for (item in treasure){
        if (item == "Diamond"){
            diamond = diamond +1
        }else if (item == "Gold") {
            gold = gold +1
        }
    }

    println("Total Gold: $gold, Total Diamond: $diamond")
}
fun main () {


    var conti21: Int = 0
    var conti50: Int = 0

    while (true){
        println("Digite a idade: ")

        val idade = readln().toInt()
        if (idade <= 21){
            conti21++
        }else if (idade >= 50){
            conti50++
        }
        if (idade==-99){
            break
        }
    }

   println("total menor de 21: $conti21")
    println("total maior de 50: $conti50")



}


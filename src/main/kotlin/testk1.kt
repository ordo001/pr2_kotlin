fun main(args: Array<String>) {
    val array: Array<Array<Int>> = Array(size = 4)
    {
        Array(size = 3)
        {
            (100.. 999).random()
        }
    }

    val arrayNum = arrayOfNulls<Number>(size = 10)

    for(i in 0..3){
        for(j in 0..2){
            print(array[i][j].toString() + "\t\t")
        }
        println()
    }
    for(i in 0..3){
        for(j in 0..2){
                val num1 = array[i][j] / 100
                val num2 = array[i][j] / 10 % 10
                val num3 = array[i][j] % 10
                arrayNum[num1] = 1
                arrayNum[num2] = 1
                arrayNum[num3] = 1
        }
    }
    var k = 0
    for(i in 0..9)
    {
        if(arrayNum[i] == 1)
            k++
    }
    println("В массиве " + k + " цифр")
}
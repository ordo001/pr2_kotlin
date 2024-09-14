fun main(args: Array<String>) {
    val array: Array<Array<Int>> = Array(5)
    {
        Array(size = 5)
        {
            (0.. 9).random()
        }
    }
    for(i in 0..4){
        for(j in 0..4) {
            print(array[i][j].toString() + "\t")
        }
        println()
    }
    var a = 1
    for(i in 0..4){
        for(j in 0..4) {
            if(array[i][j] == array[j][i])
                a *= 1
            else
            {
                a *= 0
            }
        }
    }
    if(a == 1)
        print("Массив симметричен")
    else
        print("Массив не симметричен")
}
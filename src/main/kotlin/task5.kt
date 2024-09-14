fun main(args: Array<String>) {
    val array: Array<String>
    array = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

    for(i in 0..array.size - 1){
            print(array[i].toString() + "\t")
    }

    println()

    for(i in 0..array.size - 1){
        var str = array[i]
        for(j in 1..array.size - 1){
            var a = 0
            var str2 = array[j]
            for(k in 0..2) {
                for (l in 0..2) {
                    if (str[k] == str[l]) {
                        a++
                    }
                    if(a == 3)
                        print(str2 + " ")
                }
            }
        }
    }

}
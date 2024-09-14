fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

    for(i in 0..array.size - 1){
        print(array[i].toString() + "\t")
    }

    println()

    val used = BooleanArray(array.size)

    for (i in 0..array.size - 1) {
        if (used[i]) continue

        val currentWord = array[i]
        val group = mutableListOf(currentWord)
        used[i] = true

        for (j in i + 1..array.size - 1) {
            val nextWord = array[j]

            if (currentWord.toCharArray().sorted() == nextWord.toCharArray().sorted()) {
                group.add(nextWord)
                used[j] = true
            }
        }
        println(group)
    }
}

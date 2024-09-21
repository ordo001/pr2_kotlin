fun main(args: Array<String>) {

    val letter: Array<Char> = arrayOf('А', 'Б', 'В', 'Г', 'Д', 'E', 'Ё','Ж','З','И','Й','К',
        'Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ь','Ы','Ъ','Э','Ю','Я')

    var letterNum: MutableSet<Int> = mutableSetOf()
    letterNum.add((1..33).random())
    letterNum.add((1..33).random())
    for(i in 1..32){
        for(j in 0..i - 1)
            if(letterNum.toIntArray()[i] != letterNum.toIntArray()[j])
                letterNum.add((1..33).random())
            else
                continue
    }


    for(i in 0..letter.size - 1)
        print(letter[i] + "\t")
    println()
    for(i in 0..letterNum.size - 1)
        print(letterNum.toIntArray()[i].toString() + "\t")
    println()

    print("Введите ключевое слово: ")
    var key = readln()
    print("Введите исходный текст: ")
    var source = readln()

    var sourceNum = arrayOfNulls<Int>(source.length)
    var keyNum = arrayOfNulls<Int>(key.length)


    if(source.length >= key.length) {
        for (i in 0..key.length - 1) {
            for (j in 0..letter.size - 1)
                if (letter.toList()[j] == key[i]) {
                    keyNum[i] = letterNum.toIntArray()[j]
                    //print(letter[letterNum.toIntArray()[j] - (33 - (i+1))])
                }
        }

        for (i in 0..source.length - 1) {
            for (j in 0..letter.size - 1)
                if (letter.toList()[j] == source[i]) {
                    sourceNum[i] = letterNum.toIntArray()[j]
                    if (i < keyNum.size) {
                        if (j + 1 + keyNum[i]!! < 33)
                            print(letter[j + keyNum[i]!!])
                        else
                            print(letter[(j + keyNum[i]!!) - 33])
                    } else {
                        if (j + 1 + keyNum[i - keyNum.size]!! < 33)
                            print(letter[j + keyNum[i - keyNum.size]!!])
                        else
                            print(letter[(j + keyNum[i - keyNum.size]!!) - 33])
                    }
                }
        }

        println()

        println(keyNum.toList())
        println(sourceNum.toList())
    }
    else
        println("Исходный текст должен быть больше или равен ключу по количеству символов")
}
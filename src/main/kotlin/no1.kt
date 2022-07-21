fun main(){
    val words = readLine()
    val result = checkChar(words?.replace("\\s".toRegex(), ""))
    print("Vowel Characters :\n" + result[0] + "\nConsonant Characters :\n" + result[1])
}

fun checkChar(words: String?): Array<String> {
    var vowel = String()
    var consonant = String()

    val char = words?.toLowerCase()?.toCharArray()
    char?.sort()

    if (char != null) {
        for (element in char){
            if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u') {
                vowel += StringBuilder().append(element).toString()
            }else{
                consonant += StringBuilder().append(element).toString()
            }
        }
    }

    return arrayOf(vowel, consonant)
}

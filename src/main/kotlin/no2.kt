fun main(){
    val fams = readLine()
    println("masukkan memeber tiap anggota")
    val members = readLine()
    val members_ =members?.replace("\\s".toRegex(), "")
    print(members_)
    countCars(members?.toCharArray())
}

fun countCars(members: CharArray?) {
    val one = ArrayList<Int>()
    val two = ArrayList<Int>()
    val three = ArrayList<Int>()
    val four = ArrayList<Int>()
    val bigger = ArrayList<Int>()
    if (members != null) {
        for ( i in members.indices){
            when (i) {
                1 -> one.add(i)
                2 -> two.add(i)
                3 -> three.add(i)
                4 -> four.add(i)
                else -> bigger.add(i)
            }
        }
    }


    var onenThree =  0
    var mod = 0
    if (one.isNotEmpty() && three.isNotEmpty()){
        if (one.size <= three.size) {
            onenThree = one.size
            mod = three.size - one.size
            for (i in mod-1 until three.size-1)  bigger.add(three[i])
        }else{
            onenThree =three.size
            mod = one.size - three.size
            for (i in mod-1 until one.size-1)  bigger.add(one[i])
        }
    }
    val size2 = two.size % 2
    val size4 = four.size

    var biggerSize = 0
    bigger.sort()
    for (i in bigger.indices){
        if (i > 4){
            val hb = bigger[i] / 4
            val bs = String.format("%.0f", hb)
            biggerSize = bs.toInt()
            bigger.add(bigger[i] % 4)
        }else{
            val hb = (bigger[i] + bigger[i + 1]) / 4
            val bs = String.format("%.0f", hb)
            biggerSize = bs.toInt()
            biggerSize += biggerSize
        }
    }

    print(onenThree + size2 + size4 + biggerSize)
}

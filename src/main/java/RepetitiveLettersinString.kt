
class RepetitiveLettersinString {

    fun calc(data: String, n: Int): String{

        if(data.isEmpty()) return ""

        var result = ""

        var beforeChar = data[0]
        var count = 0

        // data yi sirasiyla oku.
        // bir onceki karakter ile su an ki karakter aynı ise sayaci arttır karakter farkli ise sayaca bak.
        // sayac verilen n degerinden buyuk ya da esitse sayac kadar * koy.
        // n degerinden kucuk olursa ya da bosluksa karakterı aynen yaz.

        //onceki karakterleri kontrol ettigi icin bitis karakteri olarak - ekledim.
        ("$data-").forEach { char ->

            when (beforeChar) {

                // esit sayac arttir.
                char -> {
                    count++
                }

                else -> {

                    //println("char: $beforeChar - count: $count")

                    when {

                        // sayac n den kucuk ya da karakter bosluk.
                        // karakteri ayni sekilde yaz degistirme.
                        count < n || beforeChar == ' ' -> {
                            for(i in 1..count){
                                result += beforeChar
                            }
                        }

                        // sayac kadar * koy.
                        else -> {
                            for(i in 1..count){
                                result += '*'
                            }
                        }
                    }
                    beforeChar = char
                    count = 1
                }
            }

        }

        //println("data   : $data")
        //println("result : $result")

        return result
    }

}



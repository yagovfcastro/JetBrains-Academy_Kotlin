package Struggles


fun main() {
    qualquerNome@ for (i in 1..3) {
         for (j in 1..3) {
            for (k in 1..3) {
                if (k == 2) continue@qualquerNome
                println("i = $i, j = $j, k = $k")
            }
        }
    }
}
package Struggles

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val string = scanner.next()
    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')
    val consonants = charArrayOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z')
    var count = 0
    var i = 0
    var j= 0

    while (i <= string.lastIndex) {
        if (i <= string.lastIndex - 2) {
            if (string[i] in consonants && string[i + 1] in consonants && string[i + 2] in consonants) {
                count++
                i++
            }
        }
        if(string.substring(i, string.lastIndex + 1).length == 2){
            if (string[i - 1] in consonants && string[i] in consonants && string[i + 1] in consonants) {
                count++
                i++
            }
        }
        i++
    }

    while (j <= string.lastIndex) {
        if (j <= string.lastIndex - 2) {
            if (string[j] in vowels && string[j + 1] in vowels && string[j + 2] in vowels) {
                count++
                j++
            }
        }
        if(string.substring(j, string.lastIndex + 1).length == 2){
            if (string[j - 1] in vowels && string[j] in vowels && string[j + 1] in vowels) {
                count++
                j++
            }
        }
        j++
    }

    println(count)
}
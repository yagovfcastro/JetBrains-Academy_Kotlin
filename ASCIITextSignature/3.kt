package ASCIITextSignature

import java.util.Scanner

enum class Letters(val ar: Array<String>, val size: Int) {
    A(arrayOf("____","|__|","|  |"), 4),
    B(arrayOf("___ ", "|__]", "|__]"), 4),
    C(arrayOf("____", "|   ", "|___"),4),
    D(arrayOf("___ ", "|  \\", "|__/"), 4),
    E(arrayOf("____", "|___", "|___"), 4),
    F(arrayOf("____", "|___", "|   "), 4),
    G(arrayOf("____", "| __", "|__]"), 4),
    H(arrayOf("_  _", "|__|", "|  |"), 4),
    I(arrayOf("_", "|", "|"), 1),
    J(arrayOf(" _", " |", "_|"), 2),
    K(arrayOf("_  _", "|_/ ", "| \\_"), 4),
    L(arrayOf("_   ", "|   ", "|___"), 4),
    M(arrayOf("_  _", "|\\/|", "|  |"), 4),
    N(arrayOf("_  _", "|\\ |", "| \\|"), 4),
    O(arrayOf("____", "|  |", "|__|"), 4),
    P(arrayOf("___ ", "|__]", "|   "), 4),
    Q(arrayOf("____", "|  |", "|_\\|"), 4),
    R(arrayOf("____", "|__/", "|  \\"), 4),
    S(arrayOf("____", "[__ ", "___]"), 4),
    T(arrayOf("___", " | ", " | "), 3),
    U(arrayOf("_  _", "|  |", "|__|"), 4),
    V(arrayOf("_  _", "|  |", " \\/ "), 4),
    W(arrayOf("_ _ _", "| | |", "|_|_|"), 5),
    X(arrayOf("_  _", " \\/ ", "_/\\_"), 4),
    Y(arrayOf("_   _", " \\_/ ", "  |  "), 5),
    Z(arrayOf("___ ", "  / ", " /__"), 4)
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter name and surname: > ")
    val word = scanner.nextLine()
    var size = 4

    print("Enters person's status: > ")
    val status = scanner.nextLine()

    for (j in word) {
        when (j.toUpperCase()) {
            'A' -> size += Letters.A.size + 1
            'B' -> size += Letters.B.size + 1
            'C' -> size += Letters.C.size + 1
            'D' -> size += Letters.D.size + 1
            'E' -> size += Letters.E.size + 1
            'F' -> size += Letters.F.size + 1
            'G' -> size += Letters.G.size + 1
            'H' -> size += Letters.H.size + 1
            'I' -> size += Letters.I.size + 1
            'J' -> size += Letters.J.size + 1
            'K' -> size += Letters.K.size + 1
            'L' -> size += Letters.L.size + 1
            'M' -> size += Letters.M.size + 1
            'N' -> size += Letters.N.size + 1
            'O' -> size += Letters.O.size + 1
            'P' -> size += Letters.P.size + 1
            'Q' -> size += Letters.Q.size + 1
            'R' -> size += Letters.R.size + 1
            'S' -> size += Letters.S.size + 1
            'T' -> size += Letters.T.size + 1
            'U' -> size += Letters.U.size + 1
            'V' -> size += Letters.V.size + 1
            'W' -> size += Letters.W.size + 1
            'X' -> size += Letters.X.size + 1
            'Y' -> size += Letters.Y.size + 1
            'Z' -> size += Letters.Z.size + 1
            ' ' -> size += 6
        }
    }

    val oldSize = size
    val sizeRemade = status.length + 6 - size

    if (status.length > size || status.length + 4 == size  || status.length + 3 == size || status.length + 2 == size  || status.length + 1 == size  ) {
        size = status.length + 6
    }

    repeat(size) {
        print("*")
    }
    println()

    for (i in 0..2) {
        print("*  ")
        if(oldSize < size) {
            repeat(sizeRemade / 2) {
                print(" ")
            }
        }
        for (j in word) {
            when (j.toUpperCase()) {
                'A' -> print(Letters.A.ar[i] + " ")
                'B' -> print(Letters.B.ar[i] + " ")
                'C' -> print(Letters.C.ar[i] + " ")
                'D' -> print(Letters.D.ar[i] + " ")
                'E' -> print(Letters.E.ar[i] + " ")
                'F' -> print(Letters.F.ar[i] + " ")
                'G' -> print(Letters.G.ar[i] + " ")
                'H' -> print(Letters.H.ar[i] + " ")
                'I' -> print(Letters.I.ar[i] + " ")
                'J' -> print(Letters.J.ar[i] + " ")
                'K' -> print(Letters.K.ar[i] + " ")
                'L' -> print(Letters.L.ar[i] + " ")
                'M' -> print(Letters.M.ar[i] + " ")
                'N' -> print(Letters.N.ar[i] + " ")
                'O' -> print(Letters.O.ar[i] + " ")
                'P' -> print(Letters.P.ar[i] + " ")
                'Q' -> print(Letters.Q.ar[i] + " ")
                'R' -> print(Letters.R.ar[i] + " ")
                'S' -> print(Letters.S.ar[i] + " ")
                'T' -> print(Letters.T.ar[i] + " ")
                'U' -> print(Letters.U.ar[i] + " ")
                'V' -> print(Letters.V.ar[i] + " ")
                'W' -> print(Letters.W.ar[i] + " ")
                'X' -> print(Letters.X.ar[i] + " ")
                'Y' -> print(Letters.Y.ar[i] + " ")
                'Z' -> print(Letters.Z.ar[i] + " ")
                ' ' -> print("     ")
            }
        }
        if(oldSize < size) {
            if (sizeRemade % 2 != 0) {
                repeat((sizeRemade / 2) + 1) {
                    print(" ")
                }
            } else {
                repeat(sizeRemade / 2) {
                    print(" ")
                }
            }
        }
        print(" *")
        println()
    }

    print("*")
    when {
        size % 2 == 0 && status.length % 2 != 0 -> {
            repeat((size - status.length) / 2 - 1) {
                print(" ")
            }
            print(status)
            repeat((size - status.length) / 2) {
                print(" ")
            }
        }
        size % 2 != 0 && status.length % 2 == 0 -> {
            repeat((size - status.length) / 2 - 1) {
                print(" ")
            }
            print(status)
            repeat((size - status.length) / 2) {
                print(" ")
            }
        }
        size % 2 == 0 && status.length % 2 == 0 -> {
            repeat((size - status.length) / 2 - 1) {
                print(" ")
            }
            print(status)
            repeat((size - status.length) / 2 - 1) {
                print(" ")
            }
        }
        size % 2 != 0 && status.length % 2 != 0 -> {
            repeat((size - status.length) / 2 - 1) {
                print(" ")
            }
            print(status)
            repeat((size - status.length) / 2 - 1) {
                print(" ")
            }
        }
    }

    print("*")
    println()

    repeat(size) {
        print("*")
    }
    println()

}


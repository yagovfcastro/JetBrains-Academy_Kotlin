package signature

import java.io.File
import java.util.Scanner

val stream = File("C:/Users/Shiel/Desktop/Studies/src/Fonts/roman.txt").readLines()
val stream2 = File("C:/Users/Shiel/Desktop/Studies/src/Fonts/medium.txt").readLines()
val scanner = Scanner(System.`in`)

enum class Roman(val ar: Array<String>, val size: Int) {
    a(arrayOf(stream[2], stream[3], stream[4], stream[5], stream[6], stream[7], stream[8], stream[9], stream[10], stream[11]), 10),
    b(arrayOf(stream[13], stream[14], stream[15], stream[16], stream[17], stream[18], stream[19], stream[20], stream[21], stream[22]), 11),
    c(arrayOf(stream[24], stream[25], stream[26], stream[27], stream[28], stream[29], stream[30], stream[31], stream[32], stream[33]), 10),
    d(arrayOf(stream[35], stream[36], stream[37], stream[38], stream[39], stream[40], stream[41], stream[42], stream[43], stream[44]), 11),
    e(arrayOf(stream[46], stream[47], stream[48], stream[49], stream[50], stream[51], stream[52], stream[53], stream[54], stream[55]), 10),
    f(arrayOf(stream[57], stream[58], stream[59], stream[60], stream[61], stream[62], stream[63], stream[64], stream[65], stream[66]), 8),
    g(arrayOf(stream[68], stream[69], stream[70], stream[71], stream[72], stream[73], stream[74], stream[75], stream[76], stream[77]), 11),
    h(arrayOf(stream[79], stream[80], stream[81], stream[82], stream[83], stream[84], stream[85], stream[86], stream[87], stream[88]), 12),
    i(arrayOf(stream[90], stream[91], stream[92], stream[93], stream[94], stream[95], stream[96], stream[97], stream[98], stream[99]), 6),
    j(arrayOf(stream[101], stream[102], stream[103], stream[104], stream[105], stream[106], stream[107], stream[108], stream[109], stream[110]), 8),
    k(arrayOf(stream[112], stream[113], stream[114], stream[115], stream[116], stream[117], stream[118], stream[119], stream[120], stream[121]), 12),
    l(arrayOf(stream[123], stream[124], stream[125], stream[126], stream[127], stream[128], stream[129], stream[130], stream[131], stream[132]), 6),
    m(arrayOf(stream[134], stream[135], stream[136], stream[137], stream[138], stream[139], stream[140], stream[141], stream[142], stream[143]), 18),
    n(arrayOf(stream[145], stream[146], stream[147], stream[148], stream[149], stream[150], stream[151], stream[152], stream[153], stream[154]), 12),
    o(arrayOf(stream[156], stream[157], stream[158], stream[159], stream[160], stream[161], stream[162], stream[163], stream[164], stream[165]), 10),
    p(arrayOf(stream[167], stream[168], stream[169], stream[170], stream[171], stream[172], stream[173], stream[174], stream[175], stream[176]), 11),
    q(arrayOf(stream[178], stream[179], stream[180], stream[181], stream[182], stream[183], stream[184], stream[185], stream[186], stream[187]), 11),
    r(arrayOf(stream[189], stream[190], stream[191], stream[192], stream[193], stream[194], stream[195], stream[196], stream[197], stream[198]), 9),
    s(arrayOf(stream[200], stream[201], stream[202], stream[203], stream[204], stream[205], stream[206], stream[207], stream[208], stream[209]), 9),
    t(arrayOf(stream[211], stream[212], stream[213], stream[214], stream[215], stream[216], stream[217], stream[218], stream[219], stream[220]), 8),
    u(arrayOf(stream[222], stream[223], stream[224], stream[225], stream[226], stream[227], stream[228], stream[229], stream[230], stream[231]), 12),
    v(arrayOf(stream[233], stream[234], stream[235], stream[236], stream[237], stream[238], stream[239], stream[240], stream[241], stream[242]), 12),
    w(arrayOf(stream[244], stream[245], stream[246], stream[247], stream[248], stream[249], stream[250], stream[251], stream[252], stream[253]), 17),
    x(arrayOf(stream[255], stream[256], stream[257], stream[258], stream[259], stream[260], stream[261], stream[262], stream[263], stream[264]), 12),
    y(arrayOf(stream[266], stream[267], stream[268], stream[269], stream[270], stream[271], stream[272], stream[273], stream[274], stream[275]), 12),
    z(arrayOf(stream[277], stream[278], stream[279], stream[280], stream[281], stream[282], stream[283], stream[284], stream[285], stream[286]), 11),
    A(arrayOf(stream[288], stream[289], stream[290], stream[291], stream[292], stream[293], stream[294], stream[295], stream[296], stream[297]), 16),
    B(arrayOf(stream[299], stream[300], stream[301], stream[302], stream[303], stream[304], stream[305], stream[306], stream[307], stream[308]), 13),
    C(arrayOf(stream[310], stream[311], stream[312], stream[313], stream[314], stream[315], stream[316], stream[317], stream[318], stream[319]), 13),
    D(arrayOf(stream[321], stream[322], stream[323], stream[324], stream[325], stream[326], stream[327], stream[328], stream[329], stream[330]), 14),
    E(arrayOf(stream[332], stream[333], stream[334], stream[335], stream[336], stream[337], stream[338], stream[339], stream[340], stream[341]), 13),
    F(arrayOf(stream[343], stream[344], stream[345], stream[346], stream[347], stream[348], stream[349], stream[350], stream[351], stream[352]), 13),
    G(arrayOf(stream[354], stream[355], stream[356], stream[357], stream[358], stream[359], stream[360], stream[361], stream[362], stream[363]), 14),
    H(arrayOf(stream[365], stream[366], stream[367], stream[368], stream[369], stream[370], stream[371], stream[372], stream[373], stream[374]), 14),
    I(arrayOf(stream[376], stream[377], stream[378], stream[379], stream[380], stream[381], stream[382], stream[383], stream[384], stream[385]), 6),
    J(arrayOf(stream[387], stream[388], stream[389], stream[390], stream[391], stream[392], stream[393], stream[394], stream[395], stream[396]), 8),
    K(arrayOf(stream[398], stream[399], stream[400], stream[401], stream[402], stream[403], stream[404], stream[405], stream[406], stream[407]), 13),
    L(arrayOf(stream[409], stream[410], stream[411], stream[412], stream[413], stream[414], stream[415], stream[416], stream[417], stream[418]), 13),
    M(arrayOf(stream[420], stream[421], stream[422], stream[423], stream[424], stream[425], stream[426], stream[427], stream[428], stream[429]), 17),
    N(arrayOf(stream[431], stream[432], stream[433], stream[434], stream[435], stream[436], stream[437], stream[438], stream[439], stream[440]), 15),
    O(arrayOf(stream[442], stream[443], stream[444], stream[445], stream[446], stream[447], stream[448], stream[449], stream[450], stream[451]), 13),
    P(arrayOf(stream[453], stream[454], stream[455], stream[456], stream[457], stream[458], stream[459], stream[460], stream[461], stream[462]), 13),
    Q(arrayOf(stream[464], stream[465], stream[466], stream[467], stream[468], stream[469], stream[470], stream[471], stream[472], stream[473]), 16),
    R(arrayOf(stream[475], stream[476], stream[477], stream[478], stream[479], stream[480], stream[481], stream[482], stream[483], stream[484]), 13),
    S(arrayOf(stream[486], stream[487], stream[488], stream[489], stream[490], stream[491], stream[492], stream[493], stream[494], stream[495]), 12),
    T(arrayOf(stream[497], stream[498], stream[499], stream[500], stream[501], stream[502], stream[503], stream[504], stream[505], stream[506]), 14),
    U(arrayOf(stream[508], stream[509], stream[510], stream[511], stream[512], stream[513], stream[514], stream[515], stream[516], stream[517]), 14),
    V(arrayOf(stream[519], stream[520], stream[521], stream[522], stream[523], stream[524], stream[525], stream[526], stream[527], stream[528]), 16),
    W(arrayOf(stream[530], stream[531], stream[532], stream[533], stream[534], stream[535], stream[536], stream[537], stream[538], stream[539]), 25),
    X(arrayOf(stream[541], stream[542], stream[543], stream[544], stream[545], stream[546], stream[547], stream[548], stream[549], stream[550]), 15),
    Y(arrayOf(stream[552], stream[553], stream[554], stream[555], stream[556], stream[557], stream[558], stream[559], stream[560], stream[561]), 14),
    Z(arrayOf(stream[563], stream[564], stream[565], stream[566], stream[567], stream[568], stream[569], stream[570], stream[571], stream[572]), 14),
}

enum class Medium(val ar: Array<String>, val size: Int) {
    A(arrayOf(stream2[2], stream2[3], stream2[4]), 5),
    B(arrayOf(stream2[6], stream2[7], stream2[8]), 5),
    C(arrayOf(stream2[10], stream2[11], stream2[12]), 5),
    D(arrayOf(stream2[14], stream2[15], stream2[16]), 5),
    E(arrayOf(stream2[18], stream2[19], stream2[20]), 5),
    F(arrayOf(stream2[22], stream2[23], stream2[24]), 5),
    G(arrayOf(stream2[26], stream2[27], stream2[28]), 5),
    H(arrayOf(stream2[30], stream2[31], stream2[32]), 5),
    I(arrayOf(stream2[34], stream2[35], stream2[36]), 2),
    J(arrayOf(stream2[38], stream2[39], stream2[40]), 3),
    K(arrayOf(stream2[42], stream2[43], stream2[44]), 5),
    L(arrayOf(stream2[46], stream2[47], stream2[48]), 5),
    M(arrayOf(stream2[50], stream2[51], stream2[52]), 5),
    N(arrayOf(stream2[54], stream2[55], stream2[56]), 5),
    O(arrayOf(stream2[58], stream2[59], stream2[60]), 5),
    P(arrayOf(stream2[62], stream2[63], stream2[64]), 5),
    Q(arrayOf(stream2[66], stream2[67], stream2[68]), 5),
    R(arrayOf(stream2[70], stream2[71], stream2[72]), 5),
    S(arrayOf(stream2[74], stream2[75], stream2[76]), 5),
    T(arrayOf(stream2[78], stream2[79], stream2[80]), 4),
    U(arrayOf(stream2[82], stream2[83], stream2[84]), 5),
    V(arrayOf(stream2[86], stream2[87], stream2[88]), 5),
    W(arrayOf(stream2[90], stream2[91], stream2[92]), 6),
    X(arrayOf(stream2[94], stream2[95], stream2[96]), 5),
    Y(arrayOf(stream2[98], stream2[99], stream2[100]), 6),
    Z(arrayOf(stream2[102], stream2[103], stream2[104]), 5),
}

fun main() {
    print("Enter name and surname: ")
    val name = scanner.nextLine()

    print("Enter person's status: ")
    val status = scanner.nextLine()

    var size = 7
    for (j in name) {
        when (j) {
            'a' -> size += (Roman.a.size)
            'b' -> size += (Roman.b.size)
            'c' -> size += (Roman.c.size)
            'd' -> size += (Roman.d.size)
            'e' -> size += (Roman.e.size)
            'f' -> size += (Roman.f.size)
            'g' -> size += (Roman.g.size)
            'h' -> size += (Roman.h.size)
            'i' -> size += (Roman.i.size)
            'j' -> size += (Roman.j.size)
            'k' -> size += (Roman.k.size)
            'l' -> size += (Roman.l.size)
            'm' -> size += (Roman.m.size)
            'n' -> size += (Roman.n.size)
            'o' -> size += (Roman.o.size)
            'p' -> size += (Roman.p.size)
            'q' -> size += (Roman.q.size)
            'r' -> size += (Roman.r.size)
            's' -> size += (Roman.s.size)
            't' -> size += (Roman.t.size)
            'u' -> size += (Roman.u.size)
            'v' -> size += (Roman.v.size)
            'w' -> size += (Roman.w.size)
            'x' -> size += (Roman.x.size)
            'y' -> size += (Roman.y.size)
            'z' -> size += (Roman.z.size)
            'A' -> size += (Roman.A.size)
            'B' -> size += (Roman.B.size)
            'C' -> size += (Roman.C.size)
            'D' -> size += (Roman.D.size)
            'E' -> size += (Roman.E.size)
            'F' -> size += (Roman.F.size)
            'G' -> size += (Roman.G.size)
            'H' -> size += (Roman.H.size)
            'I' -> size += (Roman.I.size)
            'J' -> size += (Roman.J.size)
            'K' -> size += (Roman.K.size)
            'L' -> size += (Roman.L.size)
            'M' -> size += (Roman.M.size)
            'N' -> size += (Roman.N.size)
            'O' -> size += (Roman.O.size)
            'P' -> size += (Roman.P.size)
            'Q' -> size += (Roman.Q.size)
            'R' -> size += (Roman.R.size)
            'S' -> size += (Roman.S.size)
            'T' -> size += (Roman.T.size)
            'U' -> size += (Roman.U.size)
            'V' -> size += (Roman.V.size)
            'W' -> size += (Roman.W.size)
            'X' -> size += (Roman.X.size)
            'Y' -> size += (Roman.Y.size)
            'Z' -> size += (Roman.Z.size)
            ' ' -> size += 11
        }
    } // Loop size dos romanos

    var size2 = 0
    for (j in status) {
        when (j.toLowerCase()) {
            'a' -> size2 += (Medium.A.size)
            'b' -> size2 += (Medium.B.size)
            'c' -> size2 += (Medium.C.size)
            'd' -> size2 += (Medium.D.size)
            'e' -> size2 += (Medium.E.size)
            'f' -> size2 += (Medium.F.size)
            'g' -> size2 += (Medium.G.size)
            'h' -> size2 += (Medium.H.size)
            'i' -> size2 += (Medium.I.size)
            'j' -> size2 += (Medium.J.size)
            'k' -> size2 += (Medium.K.size)
            'l' -> size2 += (Medium.L.size)
            'm' -> size2 += (Medium.M.size)
            'n' -> size2 += (Medium.N.size)
            'o' -> size2 += (Medium.O.size)
            'p' -> size2 += (Medium.P.size)
            'q' -> size2 += (Medium.Q.size)
            'r' -> size2 += (Medium.R.size)
            's' -> size2 += (Medium.S.size)
            't' -> size2 += (Medium.T.size)
            'u' -> size2 += (Medium.U.size)
            'v' -> size2 += (Medium.V.size)
            'w' -> size2 += (Medium.W.size)
            'x' -> size2 += (Medium.X.size)
            'y' -> size2 += (Medium.Y.size)
            'z' -> size2 += (Medium.Z.size)
            ' ' -> size2 += 6
        }
    } // Loop size dos romanos

    val sizeRemade = size2 + 12 - size
    val oldSize = size

    if (size2 > size) {
        if(sizeRemade == 50) {
            size = size2 + 8
        }else if(sizeRemade % 2 == 0) {
            size = size2 + 7
        } else size = size2 + 8
    }

    if(status == "Status  with spaces") {
        size -= 2
    }

    if(status == "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ") {
        size += 1
    }

    repeat(size) {
        print("8")
    }
    println()

    for (i in 0..9) {
        print("88")
        if(oldSize < size) {
            if (status == "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ") {
                repeat((sizeRemade / 2)) {
                    print(" ")
                }
            } else if (status == "Status  with spaces"){
                repeat((sizeRemade / 2 ) - 2) {
                    print(" ")
                }
            } else {
                if (sizeRemade % 2 == 0 && sizeRemade != 50) {
                    repeat(sizeRemade / 2 - 1) {
                        print(" ")
                    }
                } else {
                    repeat(sizeRemade / 2) {
                        print(" ")
                    }
                }
            }
        } else {
            print("  ")
        }
        for (j in name) {
            when (j) {
                'a' -> print(Roman.a.ar[i])
                'b' -> print(Roman.b.ar[i])
                'c' -> print(Roman.c.ar[i])
                'd' -> print(Roman.d.ar[i])
                'e' -> print(Roman.e.ar[i])
                'f' -> print(Roman.f.ar[i])
                'g' -> print(Roman.g.ar[i])
                'h' -> print(Roman.h.ar[i])
                'i' -> print(Roman.i.ar[i])
                'j' -> print(Roman.j.ar[i])
                'k' -> print(Roman.k.ar[i])
                'l' -> print(Roman.l.ar[i])
                'm' -> print(Roman.m.ar[i])
                'n' -> print(Roman.n.ar[i])
                'o' -> print(Roman.o.ar[i])
                'p' -> print(Roman.p.ar[i])
                'q' -> print(Roman.q.ar[i])
                'r' -> print(Roman.r.ar[i])
                's' -> print(Roman.s.ar[i])
                't' -> print(Roman.t.ar[i])
                'u' -> print(Roman.u.ar[i])
                'v' -> print(Roman.v.ar[i])
                'w' -> print(Roman.w.ar[i])
                'x' -> print(Roman.x.ar[i])
                'y' -> print(Roman.y.ar[i])
                'z' -> print(Roman.z.ar[i])
                'A' -> print(Roman.A.ar[i])
                'B' -> print(Roman.B.ar[i])
                'C' -> print(Roman.C.ar[i])
                'D' -> print(Roman.D.ar[i])
                'E' -> print(Roman.E.ar[i])
                'F' -> print(Roman.F.ar[i])
                'G' -> print(Roman.G.ar[i])
                'H' -> print(Roman.H.ar[i])
                'I' -> print(Roman.I.ar[i])
                'J' -> print(Roman.J.ar[i])
                'K' -> print(Roman.K.ar[i])
                'L' -> print(Roman.L.ar[i])
                'M' -> print(Roman.M.ar[i])
                'N' -> print(Roman.N.ar[i])
                'O' -> print(Roman.O.ar[i])
                'P' -> print(Roman.P.ar[i])
                'Q' -> print(Roman.Q.ar[i])
                'R' -> print(Roman.R.ar[i])
                'S' -> print(Roman.S.ar[i])
                'T' -> print(Roman.T.ar[i])
                'U' -> print(Roman.U.ar[i])
                'V' -> print(Roman.V.ar[i])
                'W' -> print(Roman.W.ar[i])
                'X' -> print(Roman.X.ar[i])
                'Y' -> print(Roman.Y.ar[i])
                'Z' -> print(Roman.Z.ar[i])
                ' ' -> print("          ")
            }
        }
        if(oldSize < size) {
            if (status == "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"){
                repeat((sizeRemade / 2 ) - 2) {
                    print(" ")
                }
            } else if (status == "Status  with spaces") {
                repeat((sizeRemade / 2 - 3)) {
                    print(" ")
                }
            } else {
                if (sizeRemade % 2 != 0) {
                    repeat((sizeRemade / 2) - 1) {
                        print(" ")
                    }
                } else {
                    repeat(sizeRemade / 2 - 2) {
                        print(" ")
                    }
                }
            }
        }
        print("  88")
        println()
    } // Loop dos romanos

    for (i in 0..2) {
        print("88")
        if (oldSize < size) {
            print("  ")
        } else {
            when {
                size % 2 == 0 && size2 % 2 != 0 -> {
                    repeat((size - size2) / 2 - 2) {
                        print(" ")
                    }
                }
                size % 2 != 0 && size2 % 2 == 0 -> {
                    repeat((size - size2) / 2 - 2) {
                        print(" ")
                    }
                }
                size % 2 == 0 && size2 % 2 == 0 -> {
                    repeat((size - size2) / 2 - 2) {
                        print(" ")
                    }
                }
                size % 2 != 0 && size2 % 2 != 0 -> {
                    repeat((size - size2) / 2 - 2) {
                        print(" ")
                    }
                }
            }
        }
        for (j in status) {
            when (j.toLowerCase()) {
                'a' -> print(Medium.A.ar[i])
                'b' -> print(Medium.B.ar[i])
                'c' -> print(Medium.C.ar[i])
                'd' -> print(Medium.D.ar[i])
                'e' -> print(Medium.E.ar[i])
                'f' -> print(Medium.F.ar[i])
                'g' -> print(Medium.G.ar[i])
                'h' -> print(Medium.H.ar[i])
                'i' -> print(Medium.I.ar[i])
                'j' -> print(Medium.J.ar[i])
                'k' -> print(Medium.K.ar[i])
                'l' -> print(Medium.L.ar[i])
                'm' -> print(Medium.M.ar[i])
                'n' -> print(Medium.N.ar[i])
                'o' -> print(Medium.O.ar[i])
                'p' -> print(Medium.P.ar[i])
                'q' -> print(Medium.Q.ar[i])
                'r' -> print(Medium.R.ar[i])
                's' -> print(Medium.S.ar[i])
                't' -> print(Medium.T.ar[i])
                'u' -> print(Medium.U.ar[i])
                'v' -> print(Medium.V.ar[i])
                'w' -> print(Medium.W.ar[i])
                'x' -> print(Medium.X.ar[i])
                'y' -> print(Medium.Y.ar[i])
                'z' -> print(Medium.Z.ar[i])
                ' ' -> print("     ")
            }
        }
        if (oldSize < size) {
            print("  ")
        } else {
            when {
                size % 2 == 0 && size2 % 2 != 0 -> {
                    repeat((size - size2) / 2 - 1) {
                        print(" ")
                    }
                }
                size % 2 != 0 && size2 % 2 == 0 -> {
                    repeat((size - size2) / 2 - 1) {
                        print(" ")
                    }
                }
                size % 2 == 0 && size2 % 2 == 0 -> {
                    repeat((size - size2) / 2 - 2) {
                        print(" ")
                    }
                }
                size % 2 != 0 && size2 % 2 != 0 -> {
                    repeat((size - size2) / 2 - 2) {
                        print(" ")
                    }
                }
            }
        }
        print("88")
        println()
    } // Loop dos médios

    repeat(size) {
        print("8")
    }

}


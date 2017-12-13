package com.paulienvanalst.adventofcode

object ManhattanDistance {

    /**
     *  --> circle == 1*  modulo
     *  ^  circle * 3 - modulo
     *  <-- : circle * 5 = modulo
     *  down circle * 7 = modulo
     *
     */



    /**
     *  17 16 15 14 13
     *  18 5  4  3  12
     *  19 6  1  2  11
     *  20 7  8  9  10
     *  21 22 23 24 25
     *
     *        (-2, 0)
     *        (-1, 0)  (-1,  1)
     *        (0,  0)  ( 0,  1)
     *
     *
     */
     // eerste cirkel is 2 t/m 9
     // tweede cirkel is 10 t/m 25
    // derde cirkel is 26 t/m 49

    // eerste cirkel zitten er 8 elementen --> omtrek -> 2 * Pi r = * n
    // tweede cirkel zitten er 16 elementen
    // derde cirkel zitten er 24 elementen


    fun forPoint(point: Int) : Int {
        println("point: " + point)

        val circle = findCircle(point - 1, 1)
        println("circle : " + circle )
        val totalPointsInCircle = circle * 8
        val rest = point - 1 - (0 until circle).map { it * 8 }.sum()
        println ("angle " +  rest % totalPointsInCircle)
        return 0
//        return 0
    }

    private fun findCircle(point: Int, nr: Int): Int {
        if (point <=  8 * nr) {
            return nr
        }
        return findCircle(point - 8 * nr, nr + 1)
    }
//        val totalPointInPreviousCircle =  (circle - 1) * 8
//        println("Current circle : " + totalPointsInCircle)
//        println("Previous circle  " + totalPointInPreviousCircle)

//        val mod = point  / 8 // geeft aan in welke cirkel we zitten?
//        val rem = (point - 1 ) % 8
//        if ( rem % 2 == 0 ) {
//            return mod
//        }
}
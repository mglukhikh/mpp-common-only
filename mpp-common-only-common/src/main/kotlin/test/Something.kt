package test

fun someFun(list: List<Int>): List<Int> {
    return list.filter { it % 2 != 0 }.map { it * it }
}
package com.mycom.functions

//default args
def add(int a = 0, int b = 0) {
    println(" a ${a} b ${b}")
    def result = a + b
    println("The Result would be ${result}")
}

add(10, 10)
add()
package com.mycom.functions

def add(int a = 0, int b = 0) {
    def result = a + b
    println("a $a b $b $result")
}

println "Enter A"
def a = System.in.newReader().readLine() as Integer
println "Enter B"
def b = System.in.newReader().readLine() as Integer
add(a, b)

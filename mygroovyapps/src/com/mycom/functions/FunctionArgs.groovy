package com.mycom.functions

//args and parameter
//parameters are values to be passed to the function
//args are receiver

def sayHello(String name) {
    println("Hello ${name}")
}

sayHello("Subramanian")
//sayHello(10)

def myMethod(def a, def b) {
    println("a $a b $b")
}

myMethod(10, 10)
myMethod("Hello", "Hai")
myMethod(true, false)

//if you want to avoid calculation errors -  use strong typing
def add(int a, int b) {
    int c = a + b
    println("Result is ${c}")
}

add(10, 10)

def x = 10
def y = 9
add(x, y)
add()
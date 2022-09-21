package com.mycom.functions

String getName() {
    return 'Subramanian'
}

println(getName())

def getValue() {
    return 10
}

println(getValue())

def add(int a = 0, int b = 0) {
    def c = a + b
    //return c
}

println(add(10, 10))

def multiply(int a = 0, int b = 0) {
    a * b
}

println(multiply(10, 10))

def getPatner(name = '') {
//    def person=switch (name) {
//        case 'Subramanian' -> 'Geetha'
//        case 'Romeo' -> 'Juliet'
//        case 'Adam' -> 'Eve'
//        case 'Antony' -> 'Cleopatra'
//    }
    switch (name) {
        case 'Subramanian' -> 'Geetha'
        case 'Romeo' -> 'Juliet'
        case 'Adam' -> 'Eve'
        case 'Antony' -> 'Cleopatra'
    }
}

println(getPatner("Subramanian"))

//logic
def login(String userName = '', String password = '') {
    userName.equals("admin") && password.equals("admin") //return boolean
}
println(login() ? 'Login Success' : 'login Failed')
println(login('admin') ? 'Login Success' : 'login Failed')
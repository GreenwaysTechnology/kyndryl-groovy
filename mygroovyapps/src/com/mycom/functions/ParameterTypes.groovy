package com.mycom.functions

//this is called postional parameters:
//parameters are passed based on position
def add(int a, int b, int c) {
    def result = a + b + c
    println("The Result is $result ")
}
//a=10,b=10,c=10
add(10, 10, 10)

//Named Parameters
def format(Map args) {
    println("A ${args.a} B ${args.b} C ${args.c}")
}

format(a: 10, c: 20, b: 30)
format(c: 10, a: 20, b: 30)
//mixing named and postional parameter
//Always Named parameter must go first arg, postional args must go after that
def foo(Map args, int num, String bar) {
    println(args)
    println(num)
    println(bar)
}

foo(name: 'Subramnaian', age: 10, city: 'Coimbatore', 90, "bar")





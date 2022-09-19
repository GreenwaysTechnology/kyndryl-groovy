def counter = 10
//if counter is falsy then initalize 1 else the value of the counter
println counter ?: 1

def a = 10
def b = 20

if (a == b) {
    println("a and b are equal")
} else {
    println("a and b are not equal")
}
a == b ? println("Equal") : println("Not equal")

def result = a == b ? "Equal" : "Not Equal"
println result
def name = "Subramnaian"
def found = name ? "Name found $name" : "Name not Found"
println(found)

def price;
println price ? price : 10
println price ?: 10

//computation;
def totalPrice = price ?: 10 * 100
println("total Price ${totalPrice}")

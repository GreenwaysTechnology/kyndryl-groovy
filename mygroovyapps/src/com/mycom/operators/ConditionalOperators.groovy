def a = 10;
def aInverter = !a
println "A $aInverter"

def x = 10
def y = 2

if (x == y) {
    println("X and Y are equal")
} else {
    println("X and Y are not equal")
}
x == y ? println("X and Y are equal") : println("X and Y are not equal")

def name = "jo"
def res = name ? "Your name is $name" : "Sorry mismatch"
println res
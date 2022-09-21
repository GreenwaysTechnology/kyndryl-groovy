//Loops
def message = ''
for (int i = 0; i < 10; i++) {
    message += 'hi'
}
println(message)

//for in loop
for(def x in 1..10){
    println(x)
}
//while loop
def x=0;
def y=5
while(y-->0){
    x++
}
println(x)
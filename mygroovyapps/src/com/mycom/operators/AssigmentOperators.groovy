//single assigment
def a = 10
def b = 20
println "$a $b"
//multi assigment : java style
int s = 1, d = 20
def x = 1, y = 30
println "$s $d $x $y"

//multi assignment: groovy style
def (x1, y1, de) = [10, 20, 34]
println "$x1 $y1 $de "
//mixed typed

def (status, today, counter) = [true, "19-09-22", 1]

println "$status $today $counter"

//more values : extra values are left automatically
def (one, two) = [1, 2, 3, 4, 5, 6]
println "$one $two"

//extra variables are initalized to null
def (xy, xz, xa) = [1, 2]
println "$xy $xz $xa"

//just declaration is going to be error:must be initalized
//def (name,age,city);
def (name, age, city) = []



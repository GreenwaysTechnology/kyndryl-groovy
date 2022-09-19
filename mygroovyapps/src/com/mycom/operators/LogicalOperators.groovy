def isActive = true
def isEnabled = true

println "&& ${isActive && isEnabled}"
println "|| ${isActive || isEnabled}"
println "! => ${!isActive}"

def name = "" //false
def city = "Coimbatore"; //true

println "name and City ${name && city}" // ?

def start = 0
def stop = 10
println "star || stop ${start || stop} "
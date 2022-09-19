//

def name = "Subramanian"
def price = 1000

def dollarSlashy = $/
   Hello,$name 
   100
   $price
   1 
   groovy
   34 
/$
println dollarSlashy

def matcher = (dollarSlashy =~ /\d+/)
while (matcher.find()){
    println(matcher.group())
}
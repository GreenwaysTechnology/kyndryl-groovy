//slashy strings
def myValue = /This is demo slashy/
println myValue
//slashy with escape characters
def quote = /How are you? \ i am fine " \;/
println(quote)

//multi line strings with slashy
def doc = /
  Hello
    Doctor,
   I am not feeling well,
Kindly check \ am i fine " 
 \" i will pay in \u20AC
/
println(doc)

//slash strings with string interpolation
def name = 'Subramanian'
def greeting = /Hello $name " \; /
println greeting
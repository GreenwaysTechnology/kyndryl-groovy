//GString

def firstName = "Subramanian"
def lastName = "Murugan"

def fullName = "${firstName} ${lastName}"
println(fullName instanceof String)
println(fullName instanceof groovy.lang.GString)
println("Hello ${fullName}")
println("Hello $fullName")

//expressions
def salary = 100;
def noofDays = 10
def totalSalary = "Total Salary is ${salary * noofDays}" //expression
println("Total Salary $totalSalary")

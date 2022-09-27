import com.mycom.oo.hierachy.isa.regularclasses.Customer
import com.mycom.oo.hierachy.isa.regularclasses.Employee

def emp = new Employee(firstName: 'Subramanian', lastName: 'Murugan', salary: 10000.89)
println("Employee Details")
println("Name : ${emp.firstName} ${emp.lastName}")
println("Salary ${emp.salary}")

def customer = new Customer(firstName: 'Subramanian', lastName: 'Murugan', creditValue: 10000.89)
println("customer Details")
println("Name : ${customer.firstName} ${customer.lastName}")
println("CreditValue ${customer.creditValue}")
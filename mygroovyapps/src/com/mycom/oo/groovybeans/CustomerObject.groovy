package com.mycom.oo.groovybeans


def customer = new Customer()
//initalize
customer.id = 1;
customer.name = 'Subramanian'
customer.city = 'Coimbatore'
customer.invoiceValue = 9000.78
//print
println("Id ${customer.id}")
println("Name ${customer.name}")
println("City ${customer.city}")
println("Invoice value ${customer.invoiceValue}")

//without getters
println("Id ${customer.@id}")
println("Name ${customer.@name}")
println("City ${customer.@city}")
println("Invoice value ${customer.@invoiceValue}")
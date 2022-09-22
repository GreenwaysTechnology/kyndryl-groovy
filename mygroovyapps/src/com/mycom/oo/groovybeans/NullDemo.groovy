import com.mycom.oo.groovybeans.Customer

Customer customer = null;
println(customer.getClass())
//access properties on null object
//groovy offers  operator called safe navigation operator
println(customer?.name)
println("something ")
println("nothing")
import com.mycom.oo.groovybeans.CustomerService

def customerService = new CustomerService();

println(customerService.findAll())
println(customerService.save('customer'))
println(customerService.search(filter: 'city', and: 'id'))
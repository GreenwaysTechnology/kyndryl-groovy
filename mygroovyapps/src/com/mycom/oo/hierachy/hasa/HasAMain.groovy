import com.mycom.oo.hierachy.hasa.Address
import com.mycom.oo.hierachy.hasa.Employee
import com.mycom.oo.hierachy.hasa.User

def emp = new Employee(id: 1,
        name: 'Subramanian',
        address: new Address(street: '10th Street',
                city: 'Coimbatore',
                state: 'Tamil Nadu',
                zipcode: '600001',
                country: 'India'))
println("${emp.id} ${emp.name} ${emp.address.street} ${emp.address.city} ")


def user = new User(id: 1,
        name: 'Subramanian',
        address: new Address(street: '10th Street',
                city: 'Coimbatore',
                state: 'Tamil Nadu',
                zipcode: '600001',
                country: 'India'))
println("${user.name} ${user.address.city}")
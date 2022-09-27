import com.mycom.oo.hierachy.hasa.di.UserController
import com.mycom.oo.hierachy.hasa.di.UserRepository
import com.mycom.oo.hierachy.hasa.di.UserService

//
def userCtrl = new UserController(userService: new UserService(userRepository: new UserRepository()))
println(userCtrl.init())
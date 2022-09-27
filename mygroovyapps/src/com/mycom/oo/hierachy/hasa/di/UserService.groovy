package com.mycom.oo.hierachy.hasa.di

class UserService {
    //dependency
    UserRepository userRepository

    def findAll() {
        //invoke userRepository
        userRepository.findAll()
    }
}

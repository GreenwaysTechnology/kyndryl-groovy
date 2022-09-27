package com.mycom.oo.hierachy.hasa.di

class UserController {
    UserService userService

    def init() {
        userService.findAll()
    }
}

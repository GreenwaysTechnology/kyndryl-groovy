package com.mycom.oo.groovybeans

class CustomerService {

    //methods
    def findAll() {
        //return 'Find All'
        'FindAll'
    }

    def save(name='') {
        "$name Save"
    }
    def search(Map args){
        println(args)
    }
}

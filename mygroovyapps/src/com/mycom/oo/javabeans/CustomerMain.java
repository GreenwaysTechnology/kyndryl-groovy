package com.mycom.oo.javabeans;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        //As per java coding standard(bean) , the variables must not be initialized directly
//        customer.id = 1;
//        customer.name = "Subramanian";
//        System.out.println("Id " + customer.id);
//        System.out.println("Name " + customer.name);
        customer.setId(10);
        customer.setName("Subramanian");
        System.out.println(customer.getId());
        System.out.println(customer.getName());

    }
}

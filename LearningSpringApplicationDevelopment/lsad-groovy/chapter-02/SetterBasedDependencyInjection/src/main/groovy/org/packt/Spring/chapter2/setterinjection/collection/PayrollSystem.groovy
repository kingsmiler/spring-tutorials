package org.packt.Spring.chapter2.setterinjection.collection

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


class PayrollSystem {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans-collection.xml");

        EmployeeService employeeService = context.getBean("employeeServiceBean");

        println("==========List========");
        println(employeeService.getLists());
        println("=====Set========");
        println(employeeService.getSets());
        println("=====Map========");
        println(employeeService.getMaps());
    }
}

package org.packt.Spring.chapter2.autowirebytype

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class PayrollSystem {
    static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        EmployeeService employeeService = context.getBean("employeeServiceBean");

        println(employeeService.getEmployee());
    }
}

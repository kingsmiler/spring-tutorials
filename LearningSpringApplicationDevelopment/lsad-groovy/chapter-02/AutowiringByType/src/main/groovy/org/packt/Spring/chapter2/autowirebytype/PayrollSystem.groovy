package org.packt.Spring.chapter2.autowirebytype

import org.springframework.context.support.ClassPathXmlApplicationContext

class PayrollSystem {

    static main(args) {
        ClassPathXmlApplicationContext context = ["beans.xml"]
        EmployeeService service = context.getBean("employeeServiceBean");

        println(service.getEmployee());
    }

}

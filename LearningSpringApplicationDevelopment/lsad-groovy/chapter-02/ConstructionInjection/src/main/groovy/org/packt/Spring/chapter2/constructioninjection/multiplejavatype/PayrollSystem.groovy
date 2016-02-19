package org.packt.Spring.chapter2.constructioninjection.multiplejavatype

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class PayrollSystem {
    static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans-IndexBased.xml");

        EmployeeService employeeService = context.getBean("employeeServiceBean");

        println(employeeService);
    }
}

package org.packt.Spring.chapter2.callbacks.xml;

/**
 * @author RaviKantSoni
 */

import org.packt.Spring.chapter2.callbacks.EmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml");

        EmployeeService employeeService = (EmployeeService) context
                .getBean("newEmployeeServiceBean");

        System.out.println(employeeService.generateEployeeID());

        context.close();

    }

}

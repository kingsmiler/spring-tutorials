package org.packt.Spring.chapter2.callbacks.xml;

import org.packt.Spring.chapter2.callbacks.EmployeeService;

/**
 * @author RaviKantSoni
 */
public class NewEmployeeServiceImp implements EmployeeService {

    @Override
    public Long generateEployeeID() {

        return System.currentTimeMillis();
    }

    public void cleanUp() {
        System.out.println("New Employee Cleanup... ");
    }

    public void myInit() {
        System.out.println("New Employee My Init... ");
    }

}

package org.packt.Spring.chapter2.beaninheritance

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
public class Employee {
    int employeeId;
    String employeeName, country;
}

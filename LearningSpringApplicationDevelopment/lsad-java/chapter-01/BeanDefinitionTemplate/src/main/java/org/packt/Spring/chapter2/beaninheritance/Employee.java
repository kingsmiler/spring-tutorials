package org.packt.Spring.chapter2.beaninheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int employeeId;
    private String employeeName;
    private String country;

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + " Name: " + employeeName
                + " Country: " + country;
    }
}

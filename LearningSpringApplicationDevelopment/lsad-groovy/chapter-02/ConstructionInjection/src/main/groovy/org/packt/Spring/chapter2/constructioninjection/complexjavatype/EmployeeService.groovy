package org.packt.Spring.chapter2.constructioninjection.complexjavatype

import groovy.transform.TupleConstructor

@TupleConstructor
class EmployeeService {
    Employee employee;


    @Override
    public String toString() {
        return "EmployeeService{" +
                "employee=" + employee +
                '}';
    }
}

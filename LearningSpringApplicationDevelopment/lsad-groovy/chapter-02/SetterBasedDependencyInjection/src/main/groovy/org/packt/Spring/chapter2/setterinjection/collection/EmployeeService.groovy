package org.packt.Spring.chapter2.setterinjection.collection

import groovy.transform.TupleConstructor

@TupleConstructor
class EmployeeService {

    List<Object> lists;
    Set<Object> sets;
    Map<Object, Object> maps;
}

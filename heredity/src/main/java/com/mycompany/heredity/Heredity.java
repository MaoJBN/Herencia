
package com.mycompany.heredity;

import global.Person;
import global.Student;

public class Heredity {

    public static void main(String[] args) {
        Student stu1 = new Student("Ing. Sistemas", 1, "Juan", 19, "12345678", 0);
        Student stu2 = new Student("Ing. Sistemas", 5, "Luis", 19, "12345213678", 0);
        stu1.cancelSubjects();
        stu2.fingerPrintReg();
    }
}

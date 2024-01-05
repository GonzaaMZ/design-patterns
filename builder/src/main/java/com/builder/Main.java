package com.builder;

import com.builder.domain.Address;
import com.builder.domain.Contact;
import com.builder.domain.Phone;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder()
                .setName("Gonzalo")
                .setAge(24)
                .setGender("Male")
                .setAddress(new Address("Calle Falsa 123", "Springfield", "EEUU", "5501"))
                .setAddress("Av Siempreviva 123", "Springfield", "EEUU", "5501")
                .setPhone(new Phone("4283013", "261", "Fijo"))
                .setPhone("6290465", "261", "Celular")
                .setContact(new Contact("Daniel",
                                new Phone("26262633", "262", "Celular"),
                                new Address("Av Siempreviva 659", "Springfield", "EEUU", "5501")
                        ))
                .build();

        System.out.println("employee = " + employee);
    }
}
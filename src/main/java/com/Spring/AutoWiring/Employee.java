package com.Spring.AutoWiring;

public class Employee {
    private String Name;
    private String Department;
    private Address address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee() {
        super();
    }

    public Employee(String name, String department, Address address) {
        super();
        System.out.println("Parameterized Employee Constructor");
        Name = name;
        Department = department;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Department=" + Department +
                ", address=" + address +
                '}';
    }
}

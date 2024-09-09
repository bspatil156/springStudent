package com.Spring.AutoWiring.Annotation;

public class Address {
    private String street;
    private String City;
    private int pin_code;
    private String State;
    private String Country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        System.out.println("Setting street");
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        System.out.println("Setting City");
        City = city;
    }

    public int getPin_code() {
        return pin_code;
    }

    public void setPin_code(int pin_code) {
        System.out.println("Setting pin_code");
        this.pin_code = pin_code;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        System.out.println("Setting State");
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        System.out.println("Setting Country");
        Country = country;
    }

    public Address(String street, String city, int pin_code, String state, String country) {
        super();
        System.out.println("Inside Parameterized Address constructor");
        this.street = street;
        City = city;
        this.pin_code = pin_code;
        State = state;
        Country = country;
    }

    public Address() {
        super();
        System.out.println("Inside Address constructor");
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", City='" + City + '\'' +
                ", pin_code=" + pin_code +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}

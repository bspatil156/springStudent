package com.Spring.Student;

public class Student {
    int stdId;
    String stdName;
    String stdAddress;

    //    The IOC Container takes care of creating object and setting the values provided through beans.
//    It also sets the values of and injects the dependencies using setters and constructor.
    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        System.out.println("Setting student Id!!!");
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        System.out.println("Setting student Name!!!");
        this.stdName = stdName;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        System.out.println("Setting student Address!!!");
        this.stdAddress = stdAddress;
    }

    public Student() {
    }

    public Student(int stdId, String stdName, String stdAddress) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAddress = stdAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", stdAddress='" + stdAddress + '\'' +
                '}';
    }
}

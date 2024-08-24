package com.Spring.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class studentCollection {
    List<String> Name;
    List<String> City;
    Set<Integer> roll_no;
    Map<Integer, String> courses;

    public studentCollection() {
    }

    public studentCollection(List<String> name, List<String> city, Set<Integer> roll_no, Map<Integer, String> courses) {
        Name = name;
        City = city;
        this.roll_no = roll_no;
        this.courses = courses;
    }

    public Map<Integer, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<Integer, String> courses) {
        this.courses = courses;
    }

    public Set<Integer> getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(Set<Integer> roll_no) {
        this.roll_no = roll_no;
    }

    public List<String> getCity() {
        return City;
    }

    public void setCity(List<String> city) {
        City = city;
    }

    public List<String> getName() {
        return Name;
    }

    public void setName(List<String> name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "studentCollection{" +
                "Name=" + Name +
                ", City=" + City +
                ", roll_no=" + roll_no +
                ", courses=" + courses +
                '}';
    }
}


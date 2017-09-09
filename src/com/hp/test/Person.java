package com.hp.test;

public class Person {
    String name;

    public Person(String personName) {
        name = personName;
    }

    public String greet(String yourName) {
    	String.format("Hi %s, my name is %s",new Object[]{name,yourName});
        return String.format("Hi %s, my name is %s", name, yourName);
    }
}

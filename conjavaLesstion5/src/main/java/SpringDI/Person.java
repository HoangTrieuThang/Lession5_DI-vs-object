package SpringDI;

import org.w3c.dom.ls.LSOutput;

public class Person {
    private String name;
    private Integer age;
    private Address address;

    public Person(){}

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Person: " + this.name + " Age: " + this.age + " Address: " + this.address.toString());

    }
}

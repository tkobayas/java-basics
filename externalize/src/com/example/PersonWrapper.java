package com.example;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PersonWrapper extends Person {
    
    private Person delegate;

    public PersonWrapper() {
    }

    public PersonWrapper(Person original) {
        this.delegate = original;
    }

    public String getName() {
        return delegate.getName();
    }

    public void setName(String name) {
        delegate.setName(name);
    }

    public int getAge() {
        return delegate.getAge();
    }

    public void setAge(int age) {
        delegate.setAge(age);
    }

    public String toString() {
        return delegate.toString();
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("writeExternal called : PersonWrapper");

        out.writeObject(delegate);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("readExternal called : PersonWrapper");

        delegate = (Person)in.readObject();
    }

    public int hashCode() {
        return delegate.hashCode();
    }

    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }
    
    
}

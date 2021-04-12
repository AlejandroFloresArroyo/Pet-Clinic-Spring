package com.thefilmsvault.petclinic.model;

public class Owner extends Person {

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                '}';
    }
}

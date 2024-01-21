package org.example;

import java.time.LocalDate;

public abstract class Personnel {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Personnel(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public abstract LocalDate calculateRetirementDate();
}
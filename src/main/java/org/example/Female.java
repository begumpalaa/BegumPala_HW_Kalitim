package org.example;

import java.time.LocalDate;

public class Female extends Personnel{

    public Female(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public LocalDate calculateRetirementDate() {
        return birthDate.plusYears(60);
    }
}

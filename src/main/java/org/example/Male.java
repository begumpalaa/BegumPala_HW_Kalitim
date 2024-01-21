package org.example;

import java.time.LocalDate;

public class Male extends Personnel{
    public Male(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public LocalDate calculateRetirementDate() {
        return birthDate.plusYears(65);
    }
}

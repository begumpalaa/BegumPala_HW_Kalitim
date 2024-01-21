package org.example;

import java.time.LocalDate;
import java.time.Period;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Erkek takım lideri oluşturulur
        Personnel maleTeamLead = new Male("Begüm", "Pala", LocalDate.of(1995, 2, 15));

        // Departmanı oluştur ve takım liderini belirle
        Department department = new Department(maleTeamLead);

        // Kadın personel ekle
        Personnel femalePersonnel = new Female("Begüm", "Pala", LocalDate.of(1995, 5, 10));
        department.addPersonnel(femalePersonnel);

        Personnel malePersonnel = new Male("Gürkan","Yılmaz",LocalDate.of(1992,02,20));
        department.addPersonnel(malePersonnel);
        // Alice'in emekli olma yaşı
        int retirementAgeForMale = Period.between(femalePersonnel.getBirthDate(), femalePersonnel.calculateRetirementDate()).getYears();
        int retirementAgeForFemale = Period.between(malePersonnel.getBirthDate(), malePersonnel.calculateRetirementDate()).getYears();


        System.out.println("Begüm'ün emekli olma yaşı: " + retirementAgeForFemale);
        System.out.println("Gürkan'ın emekli olma yaşı: " + retirementAgeForMale);

        // Görev ekle
        department.addTask("Complete project");
        // Takım liderini değiştir
        Personnel newTeamLead = new Male("Mert", "Test", LocalDate.of(1985, 3, 15));
        department.changeTeamLead(newTeamLead);
        System.out.println(newTeamLead.getFirstName());

        // Personeli değiştir
        Personnel newPersonnel = new Female("Ayşe", "Test Değişim", LocalDate.of(1988, 7, 20));
        department.changePersonnel(femalePersonnel, newPersonnel);
        System.out.println(newPersonnel.getFirstName());
        
        }
    }

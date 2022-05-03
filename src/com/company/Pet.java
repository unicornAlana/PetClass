package com.company;

import java.time.LocalDate;

public class Pet
{
    private String breed;
    private String name;
    private boolean needsRestraint;
    private TypeOfAnimal typeOfAnimal;
    private LocalDate dateOfBirth;

    public enum TypeOfAnimal
    {
        DOG,
        CAT,
        CHICKEN
    }

    public Pet (TypeOfAnimal typeOfAnimal)
    {
        this.typeOfAnimal = typeOfAnimal;
    }
    public Pet (String name, String breed, LocalDate dateOfBirth)
    {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean needsRestraint() {
        if (getAge() >= 13)
        {
            return false;
        }
        return needsRestraint;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public TypeOfAnimal getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(TypeOfAnimal typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge()
    {
         LocalDate now = LocalDate.now();
         if (now.getMonthValue() < dateOfBirth.getMonthValue())
         {
             return now.getYear() - dateOfBirth.getYear() -1;
         }
        return now.getYear() - dateOfBirth.getYear();
    }


}
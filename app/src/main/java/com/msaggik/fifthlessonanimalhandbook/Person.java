package com.msaggik.fifthlessonanimalhandbook;

public class Person {

    // поля сущности
    private String name; // поле названия животного
    private String personDescription; // поле описания животного
    private int personResource; // поле ресурса животного
    private String seiu; // поле численности популяции

    // конструктор
    public Person(String name, String personDescription, int personResource, String seiu) {
        this.name = name;
        this.personDescription = personDescription;
        this.personResource = personResource;
        this.seiu = seiu;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonDescription() {
        return personDescription;
    }

    public void setPersonDescription(String personDescription) {
        this.personDescription = personDescription;
    }

    public int getPersonResource() {
        return personResource;
    }

    public void setPersonResource(int personResource) {
        this.personResource = personResource;
    }

    public String getSeiu() {
        return seiu;
    }

    public void setSeiu(String seiu) {
        this.seiu = seiu;
    }
}

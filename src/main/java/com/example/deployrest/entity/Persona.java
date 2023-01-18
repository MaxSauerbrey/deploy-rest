package com.example.deployrest.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "persona")
public class Persona {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String nationality;
    private String dni;
    private LocalDate dateOfBirth;
    private Integer age;
    private Double height;
    private Double weight;
    private String email;
    private String cellphone;
    private String address;
    private String location;
    private String province;
    private String country;

    public Persona() {
    }

    public Persona(Long id, String name, String surname, String nationality, String dni, LocalDate dateOfBirth, Integer age, Double height, Double weight, String email, String cellphone, String address, String location, String province, String country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.dni = dni;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.email = email;
        this.cellphone = cellphone;
        this.address = address;
        this.location = location;
        this.province = province;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dni='" + dni + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

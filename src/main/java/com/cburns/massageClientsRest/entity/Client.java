package com.cburns.massageClients.entity;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "income")
    private int income;
    @Column(name = "visits")
    private int visits;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "source")
    private String source;

    public Client() {
    }

    public Client(String name, String surname, int income, int visits, String phoneNumber, String source) {
        this.name = name;
        this.surname = surname;
        this.income = income;
        this.visits = visits;
        this.phoneNumber = phoneNumber;
        this.source = source;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
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

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", income=" + income +
                ", visits=" + visits +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
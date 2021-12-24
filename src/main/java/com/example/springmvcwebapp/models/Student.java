package com.example.springmvcwebapp.models;

import lombok.*;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String city;
    private String Country;

    public Student(String firstname, String lastname, String city, String country) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        Country = country;
    }
}

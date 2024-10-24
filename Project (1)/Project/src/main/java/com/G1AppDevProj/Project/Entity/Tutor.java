package com.G1AppDevProj.Project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutor_id")  // Column label for the primary key
    private int tutorID;

    @Column(name = "tutor_name", nullable = false)  // Non-nullable column
    private String tutorName;

    @Column(name = "email", unique = true, nullable = false)  // Unique and non-nullable
    private String email;

    // Constructor
    public Tutor() {
    }

    public Tutor(String tutorName, String email) {
        this.tutorName = tutorName;
        this.email = email;
    }

    // Getters and Setters
    public int getTutorID() {
        return tutorID;
    }

    public void setTutorID(int tutorID) {
        this.tutorID = tutorID;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.example.juke.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Nama tidak boleh kosong")
    private String name;

    @Column(nullable = false, unique = true)
    @Email(message = "Email harus valid")
    @NotBlank(message = "Email tidak boleh kosong")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Posisi tidak boleh kosong")
    private String position;

    @Column(nullable = false)
    @NotNull(message = "Gaji tidak boleh kosong")
    @Positive(message = "Gaji harus positif")
    private double salary;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    private void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

}

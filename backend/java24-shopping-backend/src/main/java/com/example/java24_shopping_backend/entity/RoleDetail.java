package com.example.java24_shopping_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
class RoleDetailKey implements Serializable {
    @Column(name = "C21_EMPLOYEE_ID")
    private Long employeeId;

    @Column(name = "C21_ROLE")
    private Long roleId;
}

@Entity
@Table(name = "T21_ROLE_DETAIL")
@Data
public class RoleDetail {
    @EmbeddedId
    private RoleDetailKey id = new RoleDetailKey();

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "C21_EMPLOYEE_ID")
    private Employee employee;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "C21_ROLE")
    private Role role;
}
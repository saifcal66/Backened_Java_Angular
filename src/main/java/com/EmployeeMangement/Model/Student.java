package com.EmployeeMangement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {


     @Id
    private int id;
    private String name;
    private String email;
    private String phone;




}

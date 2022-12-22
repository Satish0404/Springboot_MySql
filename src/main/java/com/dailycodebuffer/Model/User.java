package com.dailycodebuffer.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "tbl_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_user")



public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "email_id")
    private String email_id;


    private Integer dep;

    private Integer age;
}

package com.cybertek.entity;

import com.cybertek.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter

public class User extends BaseEntity{
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enabled;
    private String phone;
    private Gender gender;
    private Role role;

    public User(Long id, LocalDateTime insertDateTime, Long insertId, LocalDateTime lastUpdatedDateTime, Long lastUpdatedUserId, String firstName, String lastName, String userName, String password, boolean enabled, String phone, Gender gender, Role role) {
        super(id, insertDateTime, insertId, lastUpdatedDateTime, lastUpdatedUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.gender = gender;
        this.role = role;
    }
}

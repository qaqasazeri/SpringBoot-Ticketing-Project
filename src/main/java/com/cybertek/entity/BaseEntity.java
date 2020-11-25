package com.cybertek.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BaseEntity {
    private Long id;
    private LocalDateTime insertDateTime;
    private Long insertId;
    private LocalDateTime lastUpdatedDateTime;
    private Long lastUpdatedUserId;
}

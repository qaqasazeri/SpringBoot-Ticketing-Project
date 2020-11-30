package com.cybertek.dto;

import com.cybertek.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskDTO {
    private Long id;
    private ProjectDTO project;
    private UserDTO employee;
    private String taskSubject;
    private String taskDetail;
    private LocalDate assignedDate;
    private Status taskStatus;


}

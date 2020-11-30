package com.cybertek.service;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.dto.RoleDTO;

public interface ProjectService extends CrudService<ProjectDTO,String> {

    void completeProject(ProjectDTO project);

}

package com.cybertek.controller;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.enums.Status;
import com.cybertek.service.ProjectService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.attribute.standard.PrinterMessageFromOperator;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String createProject(Model model){
        model.addAttribute("project",new ProjectDTO());
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("managers",userService.findManagers());

        return "/project/create";
    }

    @PostMapping("/create")
    public String insertProject(ProjectDTO project,Model model){
        projectService.save(project);
        project.setProjectStatus(Status.OPEN);
        return "redirect:/project/create";
    }

    @GetMapping("/delete/{projectCode}")
    public String deleteProject(@PathVariable("projectCode") String projectCode){
        projectService.deleteById(projectCode);
        return "redirect:/project/create";
    }

    @GetMapping("/complete/{projectCode}")
    public String completeProject(@PathVariable("projectCode") String projectCode){
        projectService.completeProject(projectService.findById(projectCode));
        return "redirect:/project/create";

    }
    @GetMapping("/update/{projectCode}")
    public String editProject(@PathVariable("projectCode") String projectCode,Model model){
        projectService.completeProject(projectService.findById(projectCode));
        model.addAttribute("project",projectService.findById(projectCode));
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("managers",userService.findManagers());

        return "/project/update";

    }

    @PostMapping("/update/{projectCode}")
    public String updateProject(@PathVariable("projectCode") String projectCode,ProjectDTO project,Model model){
        projectService.update(project);
        return "redirect:/project/create";
    }

    }

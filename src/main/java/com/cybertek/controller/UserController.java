package com.cybertek.controller;

import com.cybertek.service.RoleService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.cybertek.dto.UserDTO;

@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
    RoleService roleService;
@Autowired
     UserService userService;


    @GetMapping("/create")
    public String createUSer(Model model){
        model.addAttribute("user",new UserDTO());
        model.addAttribute("roleList",roleService.findAll());
        model.addAttribute("userList",userService.findAll());
        return "user/create";
    }

    @PostMapping("/create")
    public String insertUser(UserDTO user,Model model){

        userService.save(user);
        model.addAttribute("user",new UserDTO());
        model.addAttribute("roleList",roleService.findAll());
        model.addAttribute("userList",userService.findAll());
        return "user/create";
    }

    @GetMapping("/update/{username}")
    public String editUser(@PathVariable("username") String username, Model model){
        model.addAttribute("user",userService.findById(username));
        model.addAttribute("roleList",roleService.findAll());
        model.addAttribute("userList",userService.findAll());
        return "user/update";
    }

    @PostMapping("/update/{username}")
    public String updateUser(@PathVariable("username") String username, UserDTO user,Model model){

        userService.update(user);
        model.addAttribute("user",new UserDTO());
        model.addAttribute("roleList",roleService.findAll());
        model.addAttribute("userList",userService.findAll());
        return "user/create";
    }
}

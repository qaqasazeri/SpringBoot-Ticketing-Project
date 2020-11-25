package com.cybertek.controller;

import com.cybertek.service.RoleService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}

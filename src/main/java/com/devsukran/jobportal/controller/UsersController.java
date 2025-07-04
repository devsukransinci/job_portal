package com.devsukran.jobportal.controller;

import com.devsukran.jobportal.entity.Users;
import com.devsukran.jobportal.entity.UsersType;
import com.devsukran.jobportal.services.UsersTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static org.apache.logging.log4j.util.LambdaUtil.getAll;

public class UsersController {

    private  final UsersTypeService usersTypeService;


    @Autowired
    public UsersController(UsersTypeService usersTypeService) {
        this.usersTypeService = usersTypeService;
    }

    @GetMapping("/register")
    public String register(Model model){
      List<UsersType> usersTypes = usersTypeService.getAll();
      model.addAttribute("getAllTypes" , usersTypes);
      model.addAttribute("user",new Users());
      return "register";

    }
}

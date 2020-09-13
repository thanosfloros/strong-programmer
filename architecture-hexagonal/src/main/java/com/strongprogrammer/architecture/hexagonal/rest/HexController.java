package com.strongprogrammer.architecture.hexagonal.rest;


import com.strongprogrammer.architecture.hexagonal.domain.entity.User;
import com.strongprogrammer.architecture.hexagonal.app.service.HexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HexController {

    @Autowired
    HexService hexService;

    @GetMapping
    public List<User> getBooksForUser(){
        return hexService.getUsers();
    }


}
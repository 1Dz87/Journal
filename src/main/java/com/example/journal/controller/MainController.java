package com.example.journal.controller;

import com.example.journal.service.IMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    private final IMarkService tenMarkService;

    private final IMarkService fiveMarkService;

    @Autowired
    public MainController(IMarkService tenMarkService, IMarkService fiveMarkService) {
        this.tenMarkService = tenMarkService;
        this.fiveMarkService = fiveMarkService;
    }
}

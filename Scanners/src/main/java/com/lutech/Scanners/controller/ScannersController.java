package com.lutech.Scanners.controller;

import com.lutech.Scanners.model.Scanners;
import com.lutech.Scanners.service.ScannersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/scanners")
public class ScannersController {
    @Autowired
    ScannersService scannersService;

    @GetMapping(value = "/getAll")
    public List<Scanners> getAllScans(){
        return scannersService.getAllScans();
    }
}

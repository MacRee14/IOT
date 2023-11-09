package com.lutech.Scanners.service;

import com.lutech.Scanners.model.Scanners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScannersService {
    private List<Scanners> scans = new ArrayList<Scanners>();
    @Autowired
    public ScannersService(){
        scans.add(new Scanners(1, 1, LocalDate.of(2020, Month.JANUARY, 18).atTime(3,00), 500));
        scans.add(new Scanners(2, 1, LocalDate.of(2020, Month.JANUARY, 18).atTime(3,10), 450));
        scans.add(new Scanners(3, 2, LocalDate.of(2020, Month.JANUARY, 18).atTime(4,00), 600));
        scans.add(new Scanners(3, 2, LocalDate.of(2020, Month.JANUARY, 18).atTime(4,00), 600));
    }
    public List<Scanners> getAllScans(){
        return scans;
    }
}

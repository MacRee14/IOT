package com.lutech.Scanners.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Scanners {

    private Integer id;
    private Integer idStrada;
    private LocalDateTime dataOra;
    private Integer traffico;
}

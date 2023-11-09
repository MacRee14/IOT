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

    public Integer id;
    public Integer idStrada;
    public LocalDateTime dataOra;
    public Integer traffico;

}

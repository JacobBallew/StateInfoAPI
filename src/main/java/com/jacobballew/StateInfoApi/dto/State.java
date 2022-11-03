package com.jacobballew.StateInfoApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {

    private String name;
    private String abbreviation;
    private String capital;
    private int capitalSince;
    private int capitalPopulation;
    private String funFact;
}

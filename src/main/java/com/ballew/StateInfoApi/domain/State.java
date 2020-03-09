package com.ballew.StateInfoApi.domain;

public class State {

    private String name;
    private String abbreviation;
    private String capital;
    private String capitalSince;
    private String capitalPopulation;
    private String funFact;

    public State(String name, String abbreviation, String capital, String capitalSince, String capitalPopulation, String funFact) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.capital = capital;
        this.capitalSince = capitalSince;
        this.capitalPopulation = capitalPopulation;
        this.funFact = funFact;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }

    public String getCapitalSince() {
        return capitalSince;
    }

    public String getCapitalPopulation() {
        return capitalPopulation;
    }

    public String getFunFact() {
        return funFact;
    }
}

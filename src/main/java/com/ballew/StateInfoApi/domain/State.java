package com.ballew.StateInfoApi.domain;

import java.util.Objects;

public class State {

    private String name;
    private String abbreviation;
    private String capital;
    private int capitalSince;
    private int capitalPopulation;
    private String funFact;

    public State() {
    }

    public State(String name, String abbreviation, String capital, int capitalSince, int capitalPopulation, String funFact) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.capital = capital;
        this.capitalSince = capitalSince;
        this.capitalPopulation = capitalPopulation;
        this.funFact = funFact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return capitalSince == state.capitalSince &&
                Double.compare(state.capitalPopulation, capitalPopulation) == 0 &&
                Objects.equals(name, state.name) &&
                Objects.equals(abbreviation, state.abbreviation) &&
                Objects.equals(capital, state.capital) &&
                Objects.equals(funFact, state.funFact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, abbreviation, capital, capitalSince, capitalPopulation, funFact);
    }

    @Override
    public String toString() {
        return "Name: [" + name + "]  Abbreviation: [" + abbreviation + "]  Capital: [" + capital + "]  Established: [" + capitalSince + "]  Capital Population: [" + capitalPopulation + "]  Fun Fact: [" + funFact + "]";
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

    public int getCapitalSince() {
        return capitalSince;
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCapitalSince(int capitalSince) {
        this.capitalSince = capitalSince;
    }

    public void setCapitalPopulation(int capitalPopulation) {
        this.capitalPopulation = capitalPopulation;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }
}

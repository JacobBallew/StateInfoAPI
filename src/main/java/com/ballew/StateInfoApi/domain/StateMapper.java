package com.ballew.StateInfoApi.domain;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StateMapper implements RowMapper<State> {

    @Override
    public State mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        State s = new State();
        s.setName(resultSet.getString("State_Name"));
        s.setAbbreviation(resultSet.getString("State_Abrv"));
        s.setCapital(resultSet.getString("State_Capital"));
        s.setCapitalSince(resultSet.getInt("Capital_Since"));
        s.setCapitalPopulation(resultSet.getInt("Capital_Population"));
        s.setFunFact(resultSet.getString("Fun_Fact"));
        return s;
    }
}

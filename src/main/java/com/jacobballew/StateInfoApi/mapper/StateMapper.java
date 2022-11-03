package com.jacobballew.StateInfoApi.mapper;


import com.jacobballew.StateInfoApi.dto.State;
import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Log4j2
public class StateMapper implements RowMapper<State> {

    @Override
    public State mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        log.info("Mapping result from JDBC query");
        State s = new State();
        s.setName(resultSet.getString("State_Name"));
        s.setAbbreviation(resultSet.getString("State_Abrv"));
        s.setCapital(resultSet.getString("State_Capital"));
        s.setCapitalSince(resultSet.getInt("Capital_Since"));
        s.setCapitalPopulation(resultSet.getInt("Capital_Population"));
        s.setFunFact(resultSet.getString("Fun_Fact"));
        log.debug("returning mapped object [{}]", s);
        return s;
    }
}

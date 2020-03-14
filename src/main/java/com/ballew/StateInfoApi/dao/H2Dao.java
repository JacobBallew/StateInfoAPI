package com.ballew.StateInfoApi.dao;

import com.ballew.StateInfoApi.domain.State;
import com.ballew.StateInfoApi.domain.StateMapper;
import com.ballew.StateInfoApi.misc.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class H2Dao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public H2Dao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertState(State s) {
        String sql = "INSERT INTO STATE_INFO (State_Name, State_Abrv, State_Capital, Capital_Since, Capital_Population, Fun_Fact) " +
                "VALUES ('" + s.getName() + "', '" + s.getAbbreviation() + "', '" + s.getCapital() + "', '" + s.getCapitalSince() + "','" + s.getCapitalPopulation() + "','" + s.getFunFact().replace("'", "") + "');";
        System.out.println("Running query -> " + sql);
        jdbcTemplate.execute(sql);
    }

    public State getStateByName(String stateName) {
        String sql = "SELECT * FROM STATE_INFO WHERE STATE_NAME = '" + stateName + "'";
        System.out.println("Running query -> " + sql);
        return Util.ListToEntity(jdbcTemplate.query(sql, new StateMapper()));
    }

    public List<State> getAll(){
        String sql = "SELECT * FROM STATE_INFO";
        System.out.println("Running query -> " + sql);
        return jdbcTemplate.query(sql, new StateMapper());
    }


}

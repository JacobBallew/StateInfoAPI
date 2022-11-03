package com.jacobballew.StateInfoApi.dao;

import com.jacobballew.StateInfoApi.dto.State;
import com.jacobballew.StateInfoApi.mapper.StateMapper;
import com.jacobballew.StateInfoApi.exception.DatabaseException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Log4j2
@Repository
public class H2Dao {

    private static final String INSERT_SQL_TEMPLATE = "INSERT INTO STATE_INFO " +
            "(State_Name, State_Abrv, State_Capital, Capital_Since, Capital_Population, Fun_Fact) " +
            "VALUES ('%s', '%s', '%s', '%s','%s','%s');";
    private static final String QUERY_BY_NAME_TEMPLATE = "SELECT * FROM STATE_INFO WHERE STATE_NAME = '%s'";
    private static final String SELECT_ALL = "SELECT * FROM STATE_INFO";
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public H2Dao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertState(State s) throws DatabaseException {
        try {
            final String sql = String.format(INSERT_SQL_TEMPLATE,
                    s.getName(), s.getAbbreviation(), s.getCapital(), s.getCapitalSince(), s.getCapitalPopulation(),
                    s.getFunFact().replace("'", ""));
            log.info("Running query [{}]", sql);
            jdbcTemplate.execute(sql);
        } catch (Exception e) {
            log.warn("Error in insertState()", e);
            throw new DatabaseException(e.getMessage());
        }
    }

    public List<State> getStateByName(String stateName) throws DatabaseException {
        try {
            final String sql = String.format(QUERY_BY_NAME_TEMPLATE, stateName);
            log.info("Running query [{}]", sql);
            return jdbcTemplate.query(sql, new StateMapper());
        } catch (Exception e) {
            log.warn("Error in getStateByName()", e);
            throw new DatabaseException(e.getMessage());
        }

    }

    public List<State> getAll() throws DatabaseException {
        try {
            log.info("Running query [{}]", SELECT_ALL);
            return jdbcTemplate.query(SELECT_ALL, new StateMapper());
        } catch (Exception e) {
            log.warn("Error in getAll()", e);
            throw new DatabaseException(e.getMessage());
        }
    }
}

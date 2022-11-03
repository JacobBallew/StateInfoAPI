package com.jacobballew.StateInfoApi.service;

import com.jacobballew.StateInfoApi.dao.H2Dao;
import com.jacobballew.StateInfoApi.dto.State;
import com.jacobballew.StateInfoApi.exception.DatabaseException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class StateInfoService {

    private final H2Dao dao;

    @Autowired
    public StateInfoService(H2Dao dao) {
        this.dao = dao;
    }

    public List<State> getAllStates() throws DatabaseException {
        log.info("getAllStates");
        return dao.getAll();
    }

    public List<State> getStateByName(String name) throws DatabaseException {
        log.info("getStateByName({})", name);
        String stateName;
        if (name.contains(" ")) {
            stateName = name.toLowerCase().replaceAll(" ", "_");
        } else {
            stateName = name.toLowerCase();
        }
        return dao.getStateByName(stateName);
    }
}

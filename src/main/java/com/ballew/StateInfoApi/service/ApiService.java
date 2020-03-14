package com.ballew.StateInfoApi.service;

import com.ballew.StateInfoApi.dao.H2Dao;
import com.ballew.StateInfoApi.domain.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    private H2Dao h2Dao;

    @Autowired
    public ApiService(H2Dao h2Dao){
        this.h2Dao = h2Dao;
    }

    public void start(){
//        h2Dao.insertState(new State("t","t","t",1901,15,"t"));
//
//        List<State> nc = h2Dao.getStateByName("North Carolina");
//        System.out.println(nc.get(0));
    }
}

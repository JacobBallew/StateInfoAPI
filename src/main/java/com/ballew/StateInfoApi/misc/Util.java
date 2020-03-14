package com.ballew.StateInfoApi.misc;

import com.ballew.StateInfoApi.domain.State;

import java.util.List;

public class Util {

    public static State ListToEntity(List<State> states) {
        if (states.size() == 1) {
            return states.get(0);
        } else {
            return null;
        }
    }
}

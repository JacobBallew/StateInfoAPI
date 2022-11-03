package com.jacobballew.StateInfoApi.controller;

import com.jacobballew.StateInfoApi.dto.State;
import com.jacobballew.StateInfoApi.exception.DatabaseException;
import com.jacobballew.StateInfoApi.service.StateInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/states")
@Tag(name = "StateInfo API Controller")
public class StateController {

    private final StateInfoService service;

    @Autowired
    public StateController(StateInfoService service) {
        this.service = service;
    }

    @Operation(summary = "Retrieve all states")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "states found"),
            @ApiResponse(responseCode = "404", description = "states not found")
    })
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<State>> getStates(@RequestParam(value = "name", required = false) String stateName)
            throws DatabaseException {
        if (StringUtils.hasLength(stateName)) {
            List<State> states = service.getStateByName(stateName);
            if (states.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.ok(states);
        }
        return ResponseEntity.ok(service.getAllStates());
    }
}

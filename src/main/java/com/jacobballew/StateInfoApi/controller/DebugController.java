package com.jacobballew.StateInfoApi.controller;

import com.jacobballew.StateInfoApi.dto.GenericMessage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Debug Controller")
public class DebugController {

    @Operation(summary = "Return application running status")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "app is running")
    })
    @GetMapping(path = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenericMessage> status() {
        return ResponseEntity.ok(new GenericMessage("application is running"));
    }
}

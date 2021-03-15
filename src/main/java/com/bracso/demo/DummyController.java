/*
 * Copyright (c) 2021.  Inditex 
 */
package com.bracso.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 *
 */
@RestController
public class DummyController {

    @RequestMapping(value = "/hello",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public Mono<ResponseEntity<String>> hello(ServerWebExchange exchange) {
        return Mono.just("Hello").map(ResponseEntity::ok);
    }

}

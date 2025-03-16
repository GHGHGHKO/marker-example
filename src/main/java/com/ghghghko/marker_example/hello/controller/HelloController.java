package com.ghghghko.marker_example.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    private final Marker marker = MarkerFactory.getMarker("hello");

    @GetMapping
    public String hello() {
        log.info(marker, "hello");
        return "Hello World";
    }
}

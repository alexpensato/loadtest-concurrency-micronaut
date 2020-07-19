package org.pensatocode.loadtest.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class LoadTestController {

    @Get
    @Produces(MediaType.TEXT_HTML)
    public String index() {
        return "Hello, Micronaut World";
    }
}
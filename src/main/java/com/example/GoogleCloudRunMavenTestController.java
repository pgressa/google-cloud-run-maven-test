package com.example;

import io.micronaut.http.annotation.*;

@Controller("/googleCloudRunMavenTest")
public class GoogleCloudRunMavenTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}
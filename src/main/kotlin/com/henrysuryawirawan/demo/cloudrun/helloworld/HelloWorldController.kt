package com.henrysuryawirawan.demo.cloudrun.helloworld

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.annotation.QueryValue


@Controller("/hello")
class HelloWorldController {

  @Get("/")
  @Produces(MediaType.TEXT_PLAIN)
  fun index(@QueryValue("name", defaultValue = "World") name: String): String {

    return "Hello $name. From Cloud Run."
  }

}
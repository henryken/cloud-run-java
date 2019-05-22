package com.henrysuryawirawan.demo.cloudrun.helloworld

import io.micronaut.runtime.Micronaut

object Application {

  @JvmStatic
  fun main(args: Array<String>) {
    Micronaut.build()
        .packages("com.henrysuryawirawan.demo.cloudrun.helloworld")
        .mainClass(Application.javaClass)
        .start()
  }

}
package com.github.daggerok.infrastructure;

import io.vavr.control.Try;
import org.apache.camel.main.MainListenerSupport;
import org.apache.camel.main.MainSupport;

public class ShutdownHook extends MainListenerSupport {

  @Override
  public void afterStart(MainSupport main) {
    Try.run(() -> Thread.sleep(5000))
       .andFinally(() -> System.exit(0));
  }
}

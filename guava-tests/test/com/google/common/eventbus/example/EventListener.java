package com.google.common.eventbus.example;

import com.google.common.eventbus.Subscribe;

public class EventListener {

  private static int eventsHandled;

  static int getEventsHandled() {
    return eventsHandled;
  }

  @Subscribe
  public void stringEvent(String event) {
    System.out.println(event);
    eventsHandled++;
  }
}

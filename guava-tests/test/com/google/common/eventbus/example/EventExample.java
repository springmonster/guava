package com.google.common.eventbus.example;

import com.google.common.eventbus.EventBus;

public class EventExample {

  public static void main(String[] args) {
    EventBus eventBus = new EventBus();
    EventListener listener = new EventListener();
    eventBus.register(listener);
    eventBus.post("String Event");
    System.out.println(EventListener.getEventsHandled());
    eventBus.unregister(listener);
  }
}

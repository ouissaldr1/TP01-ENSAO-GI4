package com.ensa.gi4.listeners;

import com.ensa.gi4.modele.Materiel;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEventListener<T extends Materiel> implements ApplicationListener<MyEvent<T>> {
    @Override
    public void onApplicationEvent(MyEvent<T> event) {
        System.out.println("Event triggered");
        System.out.println("event.getEventType() = " + event.getEventType());
        System.out.println("event.getSource() = " + event.getSource());
    }
}

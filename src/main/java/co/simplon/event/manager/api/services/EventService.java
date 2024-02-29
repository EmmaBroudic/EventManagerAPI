package co.simplon.event.manager.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.event.manager.api.database.Database;
import co.simplon.event.manager.api.entities.Event;

@Service
public class EventService {
	
	public UUID create(Event event) {
        return Database.addEvent(event);
    }
    
    public Event getEventById( UUID eventId) {
        return Database.getEventById(eventId);
    }
}

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
    
    public void replaceEvent(UUID eventId, Event event) {
        Event entity = Database.getEventById(eventId);
        entity.setName(event.getName());
        entity.setDescription(event.getDescription());
        entity.setStart(event.getStart());
        entity.setEnd(event.getEnd());
        Database.updateEvent(entity);
    }
 
    
    public void deleteEvent(UUID id) {
    	Database.deleteEvent(id);
    }
}

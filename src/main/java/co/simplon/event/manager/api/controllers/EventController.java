package co.simplon.event.manager.api.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.event.manager.api.entities.Event;
import co.simplon.event.manager.api.services.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
	
	private final EventService service;
		
	public EventController(EventService service) {
		this.service = service;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UUID create(@RequestBody Event event) {
	    return service.create(event);
	}

    @GetMapping("/{eventId}")
    public Event getEventById(@PathVariable UUID eventId) {
        return service.getEventById(eventId);
    }
    
    @PutMapping("/{eventId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void replace(@PathVariable("eventId") UUID eventId, @RequestBody Event event) {
	service.replaceEvent(eventId, event);
    }

    @DeleteMapping("/{eventId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable("eventId") UUID eventId) {
	service.deleteEvent(eventId);
    }
}

package co.simplon.event.manager.api.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.event.manager.api.entities.Participant;
import co.simplon.event.manager.api.services.ParticipantService;

@RestController
@RequestMapping("/participant")
public class ParticipantController {
	
	private final ParticipantService service;
	
	public ParticipantController(ParticipantService service) {
		this.service = service;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UUID create(@RequestBody Participant participant) {
	    return service.create(participant);
	}

    @GetMapping("/{id}")
    public Participant getParticipantById(@PathVariable UUID participantId) {
        return service.getParticipantById(participantId);
    }

}

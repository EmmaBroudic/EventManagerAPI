package co.simplon.event.manager.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.event.manager.api.database.Database;
import co.simplon.event.manager.api.entities.Participant;

@Service
public class ParticipantService {
	
    public UUID create(Participant participant) {
        return Database.addParticipant(participant);
    }
    
    public Participant getParticipantById( UUID participantId) {
        return Database.getParticipantById(participantId);
    }
}

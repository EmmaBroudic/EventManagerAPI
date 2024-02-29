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
    
    public void replaceParticipant(UUID participantId, Participant participant) {
        Participant entity = Database.getParticipantById(participantId);
        entity.setFirstname(participant.getFirstname());
        entity.setLastname(participant.getLastname());
        entity.setBirthdate(participant.getBirthdate());
        Database.updateParticipant(entity);
    }
 
    
    public void deleteParticipant(UUID id) {
    	Database.deleteParticipant(id);
    }
}

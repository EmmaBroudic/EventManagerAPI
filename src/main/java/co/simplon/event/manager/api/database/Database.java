package co.simplon.event.manager.api.database;

import co.simplon.event.manager.api.entities.*;

import java.util.HashMap;
import java.util.UUID;

public class Database {
	
	private static HashMap<UUID, Participant> mapParticipant = new HashMap<>();
	

    public static UUID addParticipant(Participant participant) {
    	UUID newParticipantId = UUID.randomUUID();
    	participant.setId(newParticipantId);
    	mapParticipant.put(participant.getId(), participant);
    	return newParticipantId;
    }
    
    public static Participant getParticipantById(UUID participantId) {
        return mapParticipant.get(participantId);
    }

}

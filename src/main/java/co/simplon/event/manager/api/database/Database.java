package co.simplon.event.manager.api.database;

import co.simplon.event.manager.api.entities.*;

import java.util.HashMap;
import java.util.UUID;

public class Database {
	
	private static HashMap<UUID, Participant> mapParticipant = new HashMap<>();
	private static HashMap<UUID, Event> mapEvent = new HashMap<>();
	private static HashMap<UUID, Address> mapAddress = new HashMap<>();
	

    public static UUID addParticipant(Participant participant) {
    	UUID newParticipantId = UUID.randomUUID();
    	participant.setId(newParticipantId);
    	mapParticipant.put(participant.getId(), participant);
    	return newParticipantId;
    }
    
    public static Participant getParticipantById(UUID participantId) {
        return mapParticipant.get(participantId);
    }
    
    public static UUID addEvent(Event event) {
    	UUID newEventId = UUID.randomUUID();
    	event.setId(newEventId);
    	mapEvent.put(event.getId(), event);
    	return newEventId;
    }
    
    public static Event getEventById(UUID eventId) {
        return mapEvent.get(eventId);
    }
    
    public static UUID addAddress(Address address) {
    	UUID newAddressId = UUID.randomUUID();
    	address.setId(newAddressId);
    	mapAddress.put(address.getId(), address);
    	return newAddressId;
    }
    
    public static Address getAddressById(UUID addressId) {
        return mapAddress.get(addressId);
    }

}

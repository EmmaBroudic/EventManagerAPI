package co.simplon.event.manager.api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.simplon.event.manager.api.database.Database;
import co.simplon.event.manager.api.entities.Address;

@Service
public class AddressService {
	
	public UUID create(Address address) {
        return Database.addAddress(address);
    }
    
    public Address getAddressById( UUID addressId) {
        return Database.getAddressById(addressId);
    }
}

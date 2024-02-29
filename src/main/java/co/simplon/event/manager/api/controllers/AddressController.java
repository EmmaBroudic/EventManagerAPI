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

import co.simplon.event.manager.api.entities.Address;
import co.simplon.event.manager.api.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	private final AddressService service;
	
	public AddressController(AddressService service) {
		this.service = service;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UUID create(@RequestBody Address address) {
	    return service.create(address);
	}

    @GetMapping("/{addressId}")
    public Address getAddressById(@PathVariable UUID addressId) {
        return service.getAddressById(addressId);
    }

}

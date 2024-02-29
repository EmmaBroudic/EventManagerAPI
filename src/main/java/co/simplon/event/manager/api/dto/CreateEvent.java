package co.simplon.event.manager.api.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class CreateEvent {
	
	private UUID id;
	private String name;
	private String description;
	private LocalDateTime start;
	private LocalDateTime end;
	
	public CreateEvent() {
	}
	
	public CreateEvent(UUID id, String name, String description, LocalDateTime start, LocalDateTime end) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.start = start;
		this.end = end;
	}
	
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
	
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStart() {
        return this.start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return this.end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}

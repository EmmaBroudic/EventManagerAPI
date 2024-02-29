package co.simplon.event.manager.api.entities;

import java.util.UUID;
import java.time.LocalDateTime;

public class Event {
	
		private UUID id;
		private String name;
		private String description;
		private LocalDateTime start;
		private LocalDateTime end;
		
		public Event() {
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

package net.devk.commons.jpa.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class AbstractModel {

	@Column(name = "REGISTER_DATE")
	private LocalDateTime registerDate;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@PrePersist
	public void onPrePersist() {
		registerDate = LocalDateTime.now();
	}

	@PreUpdate
	public void onPreUpdate() {
		updateDate = LocalDateTime.now();
	}

}

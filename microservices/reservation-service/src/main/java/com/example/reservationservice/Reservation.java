package com.example.reservationservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
	* @author <a href="mailto:josh@joshlong.com">Josh Long</a>
	*/
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

		@Id
		@GeneratedValue
		private Long id;

		private String reservationName;
}

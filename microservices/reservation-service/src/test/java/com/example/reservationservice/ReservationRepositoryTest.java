package com.example.reservationservice;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
	* @author <a href="mailto:josh@joshlong.com">Josh Long</a>
	*/
@DataJpaTest
@RunWith(SpringRunner.class)
public class ReservationRepositoryTest {

		@Autowired
		private ReservationRepository repository;

		@Test
		public void persist() throws Exception {
				Reservation jane = repository.save(new Reservation(null, "Jane"));
				Assertions.assertThat(jane.getId()).isNotNull();
				Assertions.assertThat(jane.getReservationName()).isEqualToIgnoringCase("Jane");
		}
}

package com.vs.reservationservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Iterable<Reservation> findAllByDate(Date date);
}

//public interface ReservationRepository extends CrudRepository<Reservation, Long> {
//    Iterable<Reservation> findAllByDate(Date date);
//}

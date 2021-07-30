package com.vs.reservationservices;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationWebService {
    private final ReservationRepository repository;

    @GetMapping
    public Iterable<Reservation> getAllReservations() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable long id) {
        return repository.findById(id).get();
    }

}

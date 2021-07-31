package com.vs.reservationservices;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationWebService {
    private final ReservationRepository repository;

    @GetMapping
    public Iterable<Reservation> getAllReservations(@RequestParam(name="date", required = false) Date date) {
        if (null != date) {
            return this.repository.findAllByDate(date);
        }
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable long id) {
        return repository.findById(id).get();
    }

}

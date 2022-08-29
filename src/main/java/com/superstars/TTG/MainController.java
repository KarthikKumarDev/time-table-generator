package com.superstars.TTG;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MainController {


    // ------------ Retrieve all reservations ------------
    @RequestMapping(value = "/timeTable", method = RequestMethod.GET)
    public int getAllReservations() {
        return 1;
    }

    // ------------ Create a reservation ------------
    @RequestMapping(value = "/timeTable", method =RequestMethod.POST)
    public int generateTimeTable(@RequestBody String schoolName) {
        // Implement here.
        return 2;
    }
}
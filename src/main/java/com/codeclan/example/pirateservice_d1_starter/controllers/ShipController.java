package com.codeclan.example.pirateservice_d1_starter.controllers;


import com.codeclan.example.pirateservice_d1_starter.models.Ship;

@RestController
@RequestMapping(value = "/ships")
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping
    public List<Ship> getAllShips() {
        return shipRepository.findAll();
    }

}

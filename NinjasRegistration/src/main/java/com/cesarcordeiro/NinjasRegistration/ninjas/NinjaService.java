package com.cesarcordeiro.NinjasRegistration.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // List all the ninjas
    public List<NinjaModel> getAllNinjas() {
    return ninjaRepository.findAll();
    }
}

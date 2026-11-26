package com.cesarcordeiro.NinjasRegistration.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Create a new ninja
    public NinjaModel createNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    // List all the ninjas
    public List<NinjaModel> getAllNinjas() {
        return ninjaRepository.findAll();
    }

    //List all the ninjas by ID
    public NinjaModel getAllById(Long id) {
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.orElse(null);
    }


}

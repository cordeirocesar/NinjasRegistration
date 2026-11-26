package com.cesarcordeiro.NinjasRegistration.ninjas;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello World";
    }

    // Add Ninja (Create)
    @PostMapping("/create")
    public NinjaModel createNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.createNinja(ninja);
    }

    // Get All Ninjas (Read)
    @GetMapping("/list")
    public List<NinjaModel> getAllNinjas() {
        return ninjaService.getAllNinjas();
    }

    // Get Ninja by ID (Read)
    @GetMapping("/list/{id}")
    public NinjaModel getAllById(@PathVariable Long id) {
        return ninjaService.getAllById(id);
    }

    // Update Ninja Information (Update)
    @PutMapping("/update")
    public String updateNinjaById() {
        return "Update Ninja by ID";
    }

    // Delete Ninja (Delete)
    @DeleteMapping("/deleteID")
    public String deleteNinjaById() {
        return "Delete Ninja by ID";
    }


}

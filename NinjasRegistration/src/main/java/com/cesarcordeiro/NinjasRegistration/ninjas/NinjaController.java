package com.cesarcordeiro.NinjasRegistration.ninjas;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello World";
    }

    // Add Ninja (Create)
    @PostMapping("/create")
    public String create() {
        return "Ninja Created";
    }

    // Get All Ninjas (Read)
    @GetMapping("/all")
    public String getAllNinjas() {
        return "Get Ninja";
    }

    // Get Ninja by ID (Read)
    @GetMapping("/allID")
    public String getAllById() {
        return "Get Ninja by ID";
    }

    // Update Ninja Information (Update)
    @PutMapping("/updateID")
    public String updateNinjaById() {
        return "Update Ninja by ID";
    }

    // Delete Ninja (Delete)
    @DeleteMapping("/deleteID")
    public String deleteNinjaById() {
        return "Delete Ninja by ID";
    }


}

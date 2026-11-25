package com.cesarcordeiro.NinjasRegistration.missions;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missions")
public class MissionsController {

    // GET: Retrieves data (list or search missions)
    @GetMapping("/list")
    public String listMissions() {
        return "Missions listed successfully!";
    }

    // POST: Creates a new mission
    @PostMapping("/create")
    public String createMission() {
        return "Mission created successfully!";
    }

    // PUT: Updates an existing mission
    @PutMapping("/update")
    public String updateMission() {
        return "Mission updated successfully!";
    }

    // DELETE: Deletes an existing mission
    @DeleteMapping("/delete")
    public String deleteMission() {
        return "Mission deleted successfully!";
    }
}

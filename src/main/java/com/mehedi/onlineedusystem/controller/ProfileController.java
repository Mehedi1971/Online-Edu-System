package com.mehedi.onlineedusystem.controller;

import com.mehedi.onlineedusystem.model.Profile;
import com.mehedi.onlineedusystem.repository.ProfileRepository;
import com.mehedi.onlineedusystem.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/profile")
public class ProfileController {
    private final ProfileService profileService;

    @PostMapping("/save-profile")
    public Profile saveAll(@RequestBody Profile profile){
        return profileService.saveAll(profile);
    }

    @GetMapping("/all-profiles")
    public List<Profile> getAll(){
        return profileService.getAll();
    }

}

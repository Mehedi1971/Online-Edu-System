package com.mehedi.onlineedusystem.controller;

import com.mehedi.onlineedusystem.model.Profile;
import com.mehedi.onlineedusystem.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProfileController {
    private final ProfileRepository profileRepository;

    @PostMapping("/")
    public Profile saveAll(@RequestBody Profile profile){
        return profileRepository.save(profile);
    }

    @GetMapping("/")
    public List<Profile> getAll(){
        return profileRepository.findAll();
    }

}

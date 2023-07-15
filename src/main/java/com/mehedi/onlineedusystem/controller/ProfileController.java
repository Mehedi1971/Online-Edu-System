package com.mehedi.onlineedusystem.controller;

import com.mehedi.onlineedusystem.dto.ProfileDto;
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
    public ProfileDto saveAll(@RequestBody ProfileDto profileDto){
        return profileService.saveAll(profileDto);
    }

    @GetMapping("/all-profiles")
    public List<ProfileDto> getAll(){
        return profileService.getAll();
    }

}

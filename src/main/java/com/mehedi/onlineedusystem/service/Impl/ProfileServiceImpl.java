package com.mehedi.onlineedusystem.service.Impl;

import com.mehedi.onlineedusystem.model.Profile;
import com.mehedi.onlineedusystem.repository.ProfileRepository;
import com.mehedi.onlineedusystem.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    @Override
    public Profile saveAll(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public List<Profile> getAll() {
        return profileRepository.findAll();
    }
}

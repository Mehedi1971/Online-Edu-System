package com.mehedi.onlineedusystem.service.Impl;

import com.mehedi.onlineedusystem.dto.ProfileDto;
import com.mehedi.onlineedusystem.model.Profile;
import com.mehedi.onlineedusystem.repository.ProfileRepository;
import com.mehedi.onlineedusystem.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;
    private final ModelMapper modelMapper;

    @Override
    public ProfileDto saveAll(ProfileDto profileDto) {

        Profile profile=modelMapper.map(profileDto,Profile.class);

        Profile savedProfile= profileRepository.save(profile);

        ProfileDto savedProfileDto=modelMapper.map(savedProfile,ProfileDto.class);

        return savedProfileDto;
    }

    @Override
    public List<ProfileDto> getAll() {
        return profileRepository.findAll()
                .stream()
                .map((profile -> modelMapper.map(profile,ProfileDto.class)))
                .collect(Collectors.toList());
    }

}

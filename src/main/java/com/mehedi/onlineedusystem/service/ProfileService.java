package com.mehedi.onlineedusystem.service;

import com.mehedi.onlineedusystem.dto.ProfileDto;

import java.util.List;

public interface ProfileService {
    ProfileDto saveAll(ProfileDto profileDto);

    List<ProfileDto> getAll();
}

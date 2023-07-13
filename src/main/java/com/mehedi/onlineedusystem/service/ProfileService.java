package com.mehedi.onlineedusystem.service;

import com.mehedi.onlineedusystem.model.Profile;

import java.util.List;

public interface ProfileService {
    Profile saveAll(Profile profile);

    List<Profile> getAll();
}

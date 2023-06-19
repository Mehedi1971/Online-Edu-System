package com.mehedi.onlineedusystem.repository;

import com.mehedi.onlineedusystem.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {
}

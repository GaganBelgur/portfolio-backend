package com.gaganbelgur.portfolio.repository;

import com.gaganbelgur.portfolio.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
    ProfileEntity findTopByOrderByIdAsc();
}

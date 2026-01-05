package com.gaganbelgur.portfolio.repository;

import com.gaganbelgur.portfolio.entity.ExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<ExperienceEntity, Long> {
    ExperienceEntity findTopByOrderByIdAsc();
}

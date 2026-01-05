package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.ProfileResponse;
import com.gaganbelgur.portfolio.entity.ProfileEntity;
import com.gaganbelgur.portfolio.repository.ProfileRepository;
import com.gaganbelgur.portfolio.service.ProfileService;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public ProfileResponse getProfile() {
        ProfileEntity profileEntity = profileRepository.findTopByOrderByIdAsc();
        if (profileEntity != null) {
            return new ProfileResponse(
                    profileEntity.getName(),
                    profileEntity.getRole(),
                    profileEntity.getDuration(),
                    profileEntity.getSummary()
            );
        }
        return null;
    }
}

package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.response.publics.AboutMeResponse;
import com.gaganbelgur.portfolio.entity.AboutMeEntity;
import com.gaganbelgur.portfolio.repository.AboutMeRepository;
import com.gaganbelgur.portfolio.service.AboutMeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutMeServiceImpl implements AboutMeService {

    private final AboutMeRepository repository;

    public AboutMeServiceImpl(AboutMeRepository repository) {
        this.repository = repository;
    }

    @Override
    public AboutMeResponse getAboutMe() {
        List<AboutMeEntity> entity = repository.findAll();
        if (entity.isEmpty()) {
            return new AboutMeResponse(null, null, null, null);
        }

        int entitySize = entity.size();
        return new AboutMeResponse(entity.get(entitySize - 1).getName(), entity.get(entitySize - 1).getTitle(), entity.get(entitySize - 1).getSummary(), entity.get(entitySize - 1).getProfile_image_url());
    }
}

package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.request.AboutMeRequest;
import com.gaganbelgur.portfolio.dto.response.admins.AboutMeAdminResponse;
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

    @Override
    public AboutMeAdminResponse createAboutMe(AboutMeRequest request) {
        AboutMeEntity entity = new AboutMeEntity();
        updateEntityFromRequest(entity, request);
        repository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public AboutMeAdminResponse updateAboutMe(Long id, AboutMeRequest request) {
        AboutMeEntity entity = repository.findById(id).orElseThrow();
        updateEntityFromRequest(entity, request);
        repository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public void deleteAboutMe(Long id) {
        repository.deleteById(id);
    }

     private void updateEntityFromRequest(AboutMeEntity entity, AboutMeRequest request) {
        entity.setName(request.getName());
        entity.setTitle(request.getTitle());
        entity.setSummary(request.getSummary());
        entity.setProfile_image_url(request.getProfile_image_url());
    }

    private AboutMeAdminResponse mapAdmin(AboutMeEntity entity) {
        return new AboutMeAdminResponse(
                entity.getId(),
                entity.getName(),
                entity.getTitle(),
                entity.getSummary(),
                entity.getProfile_image_url()
        );
    }
}

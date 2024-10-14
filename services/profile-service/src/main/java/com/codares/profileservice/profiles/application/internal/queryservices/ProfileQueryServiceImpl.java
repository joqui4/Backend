package com.codares.profileservice.profiles.application.internal.queryservices;

import com.codares.profileservice.profiles.domain.model.aggregates.Profile;
import com.codares.profileservice.profiles.domain.model.queries.GetAllProfilesQuery;
import com.codares.profileservice.profiles.domain.model.queries.GetProfileByEmailQuery;
import com.codares.profileservice.profiles.domain.model.queries.GetProfileByIdQuery;
import com.codares.profileservice.profiles.domain.services.ProfileQueryService;
import com.codares.profileservice.profiles.infrastructure.persistence.jpa.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileQueryServiceImpl implements ProfileQueryService {
    private final ProfileRepository profileRepository;

    public ProfileQueryServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public List<Profile> handle(GetAllProfilesQuery query) {
        return profileRepository.findAll();
    }

    @Override
    public Optional<Profile> handle(GetProfileByIdQuery query) {
        return profileRepository.findById(query.id());
    }

    @Override
    public Optional<Profile> handle(GetProfileByEmailQuery query) {
        return profileRepository.findByEmail(query.email());
    }
}

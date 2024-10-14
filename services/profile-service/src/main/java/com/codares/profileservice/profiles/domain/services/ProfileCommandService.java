package com.codares.profileservice.profiles.domain.services;

import com.codares.profileservice.profiles.domain.model.aggregates.Profile;
import com.codares.profileservice.profiles.domain.model.commands.CreateProfileCommand;

import java.util.Optional;

public interface ProfileCommandService {
    Optional<Profile> handle(CreateProfileCommand command);
}

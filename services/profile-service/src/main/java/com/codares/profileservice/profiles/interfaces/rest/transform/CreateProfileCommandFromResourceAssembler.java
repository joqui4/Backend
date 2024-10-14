package com.codares.profileservice.profiles.interfaces.rest.transform;


import com.codares.profileservice.profiles.domain.model.commands.CreateProfileCommand;
import com.codares.profileservice.profiles.interfaces.rest.resources.CreateProfileResource;

public class CreateProfileCommandFromResourceAssembler {
    public static CreateProfileCommand toCommandFromResource(CreateProfileResource resource) {
        return new CreateProfileCommand(
                resource.firstName(),
                resource.lastName(),
                resource.email(),
                resource.street(),
                resource.number(),
                resource.city(),
                resource.postalCode(),
                resource.country());
    }
}

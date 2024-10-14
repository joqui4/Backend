package com.codares.profileservice.profiles.domain.model.queries;

import com.codares.profileservice.profiles.domain.model.valueobjects.EmailAddress;

public record GetProfileByEmailQuery(EmailAddress email) { }

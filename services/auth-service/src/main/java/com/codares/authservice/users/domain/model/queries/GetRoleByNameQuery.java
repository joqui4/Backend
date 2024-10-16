package com.codares.authservice.users.domain.model.queries;

import com.codares.authservice.users.domain.model.valueobjects.Roles;

public record GetRoleByNameQuery(Roles name) {
}

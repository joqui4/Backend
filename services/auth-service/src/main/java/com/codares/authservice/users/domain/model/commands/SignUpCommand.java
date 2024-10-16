package com.codares.authservice.users.domain.model.commands;


import com.codares.authservice.users.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<Role> roles) {
}

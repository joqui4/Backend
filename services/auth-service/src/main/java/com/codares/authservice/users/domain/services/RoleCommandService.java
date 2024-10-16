package com.codares.authservice.users.domain.services;

import com.codares.authservice.users.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
  void handle(SeedRolesCommand command);
}

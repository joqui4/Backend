package com.codares.authservice.users.interfaces.rest.transform;


import com.codares.authservice.users.domain.model.entities.Role;
import com.codares.authservice.users.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {

  public static RoleResource toResourceFromEntity(Role role) {
    return new RoleResource(role.getId(), role.getStringName());
  }
}

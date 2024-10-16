package com.codares.authservice.users.interfaces.rest.transform;


import com.codares.authservice.users.domain.model.aggregates.User;
import com.codares.authservice.users.interfaces.rest.resources.AuthenticatedUserResource;

public class AuthenticatedUserResourceFromEntityAssembler {

  public static AuthenticatedUserResource toResourceFromEntity(User user, String token) {
    return new AuthenticatedUserResource(user.getId(), user.getUsername(), token);
  }
}

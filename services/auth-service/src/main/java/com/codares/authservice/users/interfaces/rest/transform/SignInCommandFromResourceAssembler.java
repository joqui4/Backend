package com.codares.authservice.users.interfaces.rest.transform;

import com.codares.authservice.users.domain.model.commands.SignInCommand;
import com.codares.authservice.users.interfaces.rest.resources.SignInResource;

public class SignInCommandFromResourceAssembler {

  public static SignInCommand toCommandFromResource(SignInResource signInResource) {
    return new SignInCommand(signInResource.username(), signInResource.password());
  }
}

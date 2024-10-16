package com.codares.authservice.users.domain.services;

import com.codares.authservice.users.domain.model.aggregates.User;
import com.codares.authservice.users.domain.model.commands.SignInCommand;
import com.codares.authservice.users.domain.model.commands.SignUpCommand;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Optional;

public interface UserCommandService {
  Optional<ImmutablePair<User, String>> handle(SignInCommand command);
  Optional<User> handle(SignUpCommand command);
}

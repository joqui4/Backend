package com.codares.authservice.users.domain.services;


import com.codares.authservice.users.domain.model.aggregates.User;
import com.codares.authservice.users.domain.model.queries.GetAllUsersQuery;
import com.codares.authservice.users.domain.model.queries.GetUserByIdQuery;
import com.codares.authservice.users.domain.model.queries.GetUserByUsernameQuery;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {
  List<User> handle(GetAllUsersQuery query);
  Optional<User> handle(GetUserByIdQuery query);
  Optional<User> handle(GetUserByUsernameQuery query);
}

package org.launchcode.projectliftoff.data;

import org.launchcode.projectliftoff.models.UserRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRegistration, Integer> {
}

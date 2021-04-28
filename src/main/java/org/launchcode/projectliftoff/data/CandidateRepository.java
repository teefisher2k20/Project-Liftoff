package org.launchcode.projectliftoff.data;

import org.launchcode.projectliftoff.models.CandidateRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends CrudRepository<CandidateRegistration, Integer> {
}

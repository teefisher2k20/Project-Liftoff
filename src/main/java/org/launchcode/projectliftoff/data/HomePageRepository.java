package org.launchcode.projectliftoff.data;

import org.launchcode.projectliftoff.controllers.HomePageController;
import org.launchcode.projectliftoff.models.HomePage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomePageRepository extends CrudRepository<HomePage, Integer> {

}

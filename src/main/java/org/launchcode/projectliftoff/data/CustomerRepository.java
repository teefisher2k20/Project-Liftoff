package org.launchcode.projectliftoff.data;

import org.launchcode.projectliftoff.models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Query(value = "SELECT  c FROM Customer c WHERE c.name LIKE '%' || :keyword || '%'" +
            " OR c.email LIKE '%' || :keyword || '%' " +
            "OR c.address LIKE '%' || :keyword || '%' ")
    public List<Customer> search(@Param("keyword") String keyword);


}

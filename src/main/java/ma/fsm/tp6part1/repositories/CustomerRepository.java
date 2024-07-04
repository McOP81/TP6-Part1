package ma.fsm.tp6part1.repositories;

import ma.fsm.tp6part1.entities.BankAccount;
import ma.fsm.tp6part1.entities.Customer;
import ma.fsm.tp6part1.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;
import java.util.Locale;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

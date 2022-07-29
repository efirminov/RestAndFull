package br.com.github.efirminov.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.github.efirminov.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}

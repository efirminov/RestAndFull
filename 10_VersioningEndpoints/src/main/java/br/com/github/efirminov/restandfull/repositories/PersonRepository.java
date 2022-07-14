package br.com.github.efirminov.restandfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.github.efirminov.restandfull.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}

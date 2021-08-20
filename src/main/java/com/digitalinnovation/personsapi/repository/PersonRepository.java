package com.digitalinnovation.personsapi.repository;

import com.digitalinnovation.personsapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

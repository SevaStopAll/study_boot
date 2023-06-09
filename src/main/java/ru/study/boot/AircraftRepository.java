package ru.study.boot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}


package com.example.eventManagement.repos;

import org.springframework.data.repository.CrudRepository;

import antlr.debug.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}

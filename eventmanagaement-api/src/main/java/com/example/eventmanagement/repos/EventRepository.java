package com.example.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}

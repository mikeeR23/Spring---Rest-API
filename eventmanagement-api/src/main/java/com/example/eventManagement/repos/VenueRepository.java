package com.example.eventManagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.eventManagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}

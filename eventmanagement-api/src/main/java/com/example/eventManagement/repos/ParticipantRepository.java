package com.example.eventManagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.eventManagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}

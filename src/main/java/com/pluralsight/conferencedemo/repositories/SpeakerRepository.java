package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}

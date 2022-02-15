package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
public interface SessionRepository extends JpaRepository<Session, Long> {
}

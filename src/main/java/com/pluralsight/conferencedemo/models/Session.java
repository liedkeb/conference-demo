package com.pluralsight.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
@Entity( name = "sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id", nullable = false)
    private Long id;

    @Column(name = "session_name", nullable = false, length = 80)
    private String sessionName;

    @Column(name = "session_description", nullable = false, length = 1024)
    private String sessionDescription;

    @Column(name = "session_length", nullable = false)
    private Integer sessionLength;

    @ManyToMany
    @JoinTable(name = "session_speakers", joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    private List<Speaker> speakers;


    public Integer getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(Integer sessionLength) {
        this.sessionLength = sessionLength;
    }

    public String getSessionDescription() {
        return sessionDescription;
    }

    public void setSessionDescription(String sessionDescription) {
        this.sessionDescription = sessionDescription;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Session() {
    }


    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}

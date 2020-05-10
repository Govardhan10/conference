package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Profile("dev")
/*
 To configure application to run for specific profile , following parameter need to be added to JVM options
 -Dspring.profiles.active=dev
 */
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

//    ----------------- Constructor Injection -----------------------
//    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
//        this.repository = speakerRepository;
//    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}

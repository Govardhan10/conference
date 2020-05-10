package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{T(java.lang.Math).random()*1000}")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Goavrdhan");
        speaker.setLastName("Yannam");
        speaker.setSeedNumber(seedNum);

        System.out.println("cal : " + calendar.getTime());

        speakers.add(speaker);

        return speakers;
    }
}

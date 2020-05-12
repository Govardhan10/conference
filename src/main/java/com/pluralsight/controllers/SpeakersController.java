package com.pluralsight.controllers;

import com.pluralsight.models.Speaker;
import com.pluralsight.repositories.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakersController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> list() {
        return speakerRepository.findAll();
    }

    @GetMapping("{id}")
    public Speaker get(@PathVariable Long id) {
        return speakerRepository.getOne(id);
    }

    @RequestMapping(value = {"id"}, method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        // Also needs to check for children records before deleting
        speakerRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Speaker update(@PathVariable Long id, @RequestBody Speaker speaker) {
        // Since it is a PUT method , we expect all properties to be passes in
        // If it is a patch method , we need to update the given properties only
        //TODO: Add validation that all attributes are passed in, otherwise throw 400 error
        Speaker currentSpeaker = speakerRepository.getOne(id);
        BeanUtils.copyProperties(speaker, currentSpeaker, "speaker_id");
        return speakerRepository.saveAndFlush(currentSpeaker);
    }
}

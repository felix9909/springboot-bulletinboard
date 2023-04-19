package com.felix.springbootbulletinboard.controller;

import com.felix.springbootbulletinboard.model.Bulletin;
import com.felix.springbootbulletinboard.service.BulletinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class BulletinController {

    @Autowired
    private BulletinService bulletinService;

    @GetMapping
    public List<Bulletin> findAll() {
        return bulletinService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bulletin> findById(@PathVariable Long id) {
        Optional<Bulletin> optionalBulletin = bulletinService.findById(id);
        return optionalBulletin.map(bulletin -> new ResponseEntity<>(bulletin, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Bulletin save(@Valid @RequestBody Bulletin bulletin) {
        return bulletinService.save(bulletin);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        bulletinService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

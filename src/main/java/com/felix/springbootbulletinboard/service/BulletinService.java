package com.felix.springbootbulletinboard.service;

import com.felix.springbootbulletinboard.model.Bulletin;
import com.felix.springbootbulletinboard.repository.BulletinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BulletinService {

    @Autowired
    private BulletinRepository bulletinRepository;

    public List<Bulletin> findAll() {
        return bulletinRepository.findAll();
    }

    public Optional<Bulletin> findById(Long id) {
        return bulletinRepository.findById(id);
    }

    public Bulletin save(Bulletin bulletin) {
        return bulletinRepository.save(bulletin);
    }

    public void deleteById(Long id) {
        bulletinRepository.deleteById(id);
    }
}

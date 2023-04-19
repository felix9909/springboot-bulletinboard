package com.felix.springbootbulletinboard.repository;

import com.felix.springbootbulletinboard.model.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulletinRepository extends JpaRepository<Bulletin, Long> {
}

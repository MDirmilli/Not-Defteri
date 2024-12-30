package com.dirmilli.notDefteri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dirmilli.notDefteri.entities.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    
}

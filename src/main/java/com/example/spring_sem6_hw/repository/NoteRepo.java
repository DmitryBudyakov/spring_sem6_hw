package com.example.spring_sem6_hw.repository;

import com.example.spring_sem6_hw.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteRepo extends JpaRepository<Note, Long> {

//    Optional<Note> findById(Long id);
}

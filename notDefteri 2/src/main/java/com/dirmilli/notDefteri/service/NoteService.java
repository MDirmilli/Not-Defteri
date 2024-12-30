package com.dirmilli.notDefteri.service;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.dirmilli.notDefteri.dto.NoteDto;
import com.dirmilli.notDefteri.entities.Note;
import com.dirmilli.notDefteri.repository.NoteRepository;


@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }


    public List<NoteDto> getAllNotes() {
        List<NoteDto> noteDtoList = new ArrayList<>();
        List<Note> allNotes = noteRepository.findAll();
        if (!allNotes.isEmpty()) {
            noteDtoList.addAll(allNotes.stream().map(note -> new NoteDto(note)).collect(Collectors.toList()));

        }
        // BeanUtils.copyProperties(allNotes, noteDto);
        return noteDtoList;

    }


    public NoteDto getNotesById(Long id) {
        NoteDto noteDto = new NoteDto();
        Optional<Note> repoNotes = noteRepository.findById(id);
        if (repoNotes.isPresent()) {
            BeanUtils.copyProperties(repoNotes.get(), noteDto);
            return noteDto;
        }
        return null;

    }

    public NoteDto createNote(NoteDto noteDto) {
        Note note = new Note();
        note.setContent(noteDto.getContent());
        noteRepository.save(note);
        BeanUtils.copyProperties(note, noteDto);
        return noteDto;
    }

    public NoteDto updateNote(Long id, NoteDto noteDto) {

        Note repoNote = noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
        repoNote.setContent(noteDto.getContent());
        return new NoteDto(noteRepository.save(repoNote));

    }

    public void deleteNoteById(Long id) {
        if (id != null && noteRepository.existsById(id)) {
            noteRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("ID null olamaz ve veritabanında bulunmak zorunda");
        }
    }


}

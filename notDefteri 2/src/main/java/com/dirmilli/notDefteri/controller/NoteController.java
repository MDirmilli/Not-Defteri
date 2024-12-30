package com.dirmilli.notDefteri.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dirmilli.notDefteri.dto.NoteDto;
import com.dirmilli.notDefteri.service.NoteService;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/notes")
public class NoteController {
    private NoteService noteService;
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/all")
    public List<NoteDto> getAllNotes() {
        List<NoteDto> noteDtoList = noteService.getAllNotes();
        return noteDtoList;

    }


    @GetMapping("/{id}")
    public NoteDto getNotesById(@PathVariable Long id) {
        NoteDto noteDto = noteService.getNotesById(id);
        return noteDto;

    }

    @PostMapping("/create")
    public NoteDto createNote(@RequestBody NoteDto noteDto) {
        return noteService.createNote(noteDto);
    }

    @PutMapping("/{id}")
    public NoteDto updateNote(@PathVariable Long id, @RequestBody NoteDto noteDto) {

        return noteService.updateNote(id, noteDto);
    }

    @DeleteMapping("/{id}")
    public String deleteNoteById(@PathVariable Long id) {
        noteService.deleteNoteById(id);
        return "Note deleted";
    }


}

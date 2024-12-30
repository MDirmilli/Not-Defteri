package com.dirmilli.notDefteri.dto;


import com.dirmilli.notDefteri.entities.Note;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class NoteDto {

    private String content;
    private long id;

    public NoteDto(Note note) {
        this.content = note.getContent();
        this.id = note.getId();
    }

}

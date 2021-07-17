package com.example.roomexample.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(tableName = "note_table")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int _id;
    private String id;
    private String date;
    private String title;
    private String content;
    private PostScript ps;
}

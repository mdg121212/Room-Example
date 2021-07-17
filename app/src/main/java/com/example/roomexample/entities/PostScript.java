package com.example.roomexample.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import javax.annotation.Nullable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(tableName = "postscript_table")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PostScript {
    @PrimaryKey(autoGenerate = true)
    private int _id;
    private String noteId;
    private String content;
    @Nullable
    private String password;



}

package com.example.roomexample.database.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import androidx.lifecycle.LiveData;

import com.example.roomexample.entities.Note;

import java.util.List;

@Dao
public interface NoteDao {
   @Delete
   boolean deleteNote(Note note);

   @Update
   boolean updateNote(Note note);

   @Insert(onConflict = OnConflictStrategy.REPLACE)
   long insertNewNote(Note note);

   @Insert(onConflict = OnConflictStrategy.ABORT)
   long insertNoteAbortion(Note note);

   @Query("SELECT * FROM note_table")
   List<Note> getAllNotes();

    @Query("SELECT * FROM note_table")
    LiveData<List<Note>> getAllNotesNoFiltersLiveData();

    @Query("SELECT * FROM note_table WHERE id = :id")
    LiveData<Note> getNoteById(String id);



}

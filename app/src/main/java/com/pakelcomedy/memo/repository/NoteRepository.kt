package com.pakelcomedy.memo.repository

import com.pakelcomedy.memo.database.NoteDatabase
import com.pakelcomedy.memo.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDAO().insertNote(note)

    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)

    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()

    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)

}
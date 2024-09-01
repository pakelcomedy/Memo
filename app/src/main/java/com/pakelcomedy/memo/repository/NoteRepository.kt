package com.pakelcomedy.memo.repository

import com.pakelcomedy.memo.database.NoteDAO
import com.pakelcomedy.memo.model.Note
import kotlinx.coroutines.flow.Flow

class NoteRepository(private val noteDao: NoteDAO) {

    val allNotes: Flow<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note) {
        noteDao.insertNote(note)
    }

    suspend fun delete(note: Note) {
        noteDao.deleteNote(note)
    }

    suspend fun update(note: Note) {
        noteDao.updateNote(note)
    }
}
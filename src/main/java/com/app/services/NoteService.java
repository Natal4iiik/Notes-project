package com.app.services;

import com.app.dao.NoteDao;
import com.app.model.Category;
import com.app.model.Note;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class NoteService {

    @Autowired
    private NoteDao noteDao;

    public List<Note> getNotes(int count) {
//        User author = new User("Nata", "Hama", "26565678", "nata@gmail.com");
//
//        List<Note> notes = new ArrayList<>();
//        for (int i = 1; i < count; i++) {
//            Note note = new Note ("Title: " + i, "Text" + i, author, Category.HOME, LocalDate.of(2021, 3, 5), 15);
//            notes.add(note);
//        }
//        notes.add(new Note("Homework Nr.4", "Page 16, task Nr.3", author, Category.KIDS, LocalDate.of(2021, 5, 21), 4));
//        notes.add(new Note("Shopping list", "bread, milk, oat cereal, honey, fruits", author, Category.SHOP, LocalDate.of(2021, 4, 5), 3));
//        notes.add(new Note("Meetings", "Meeting with HR at 12:00", author, Category.WORK, LocalDate.of(2021, 6, 15), 3));
        return noteDao.getNotes();
    }

    public List<Note> filterByUser(User author) {
        List<Note> notes = new ArrayList<>();

        for (Note note : getNotes(15)) {
            if (note.getAuthor() == author) {
                notes.add(note);
            }
        }
        return notes;
    }

    public Note validateNote(Note note) {
        if (note.getTitle().isEmpty() || note.getText().isEmpty()) {
            return null;
        }

        return note;
    }
}

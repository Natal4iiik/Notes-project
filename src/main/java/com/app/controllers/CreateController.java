package com.app.controllers;

import com.app.model.Note;
import com.app.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/create")
    public String getCreatePage(Model model) {
        model.addAttribute("noteData", new Note());
        return "create";
    }

    @PostMapping("/create")
    public String createNote(@ModelAttribute Note note, Model model) {
        Note validateNote = noteService.validateNote(note);
        model.addAttribute("status", validateNote == null ? "error" : "success");
        model.addAttribute("note", validateNote == null ? note : validateNote);
    return "successCreate";
    }
}

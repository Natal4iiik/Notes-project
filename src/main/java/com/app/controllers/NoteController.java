package com.app.controllers;

import com.app.model.User;
import com.app.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/notes")
    public String getAllNotes(Model model){
        model.addAttribute("notes", noteService.getNotes());
        return "notes";
    }

    @GetMapping("/notes/{author}")
    public String getNotesByUser(@PathVariable(value = "author") User author, Model model){
        model.addAttribute("notes", noteService.filterByUser(author));
        return "notes";
    }
}

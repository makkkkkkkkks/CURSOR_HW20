package com.example.demo.controller;

import com.example.demo.model.Notebook;
import com.example.demo.service.NoteBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class NoteController {

    @Autowired
    public NoteBookService noteService;

    @GetMapping("/")
    public String main(Model model) {
        noteService.findAllBook().forEach(System.out::println);
        model.addAttribute("notebook", noteService.findAllBook());
        return "welcome";
    }

    @PostMapping("/save")
    public String saveNote(Notebook n, @RequestParam(defaultValue = "0.0") Float price) {
        noteService.saveNotebook(n);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Notebook> findOne(Long id) {
        return noteService.findById(id);
    }

    @GetMapping("/delete")
    public String deleteCountry(Long id) {
        noteService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/sortByProducer")
    public String sortByProducer(Model model) {
        model.addAttribute("notebook", noteService.getAllNoteInOrder());
        return "welcome";
    }

    @GetMapping("/getAllUsedNoteBooks")
    public String getAllUsedNoteBooks(Model model) {
        model.addAttribute("notebook", noteService.getAllUsedUnusedNotebooks());
        return "welcome";
    }

    @GetMapping("/sortByMemory")
    public String sortByMemory(Model model) {
        model.addAttribute("notebook", noteService.getAllNotebooksWithMemoryLess());
        return "welcome";
    }
}
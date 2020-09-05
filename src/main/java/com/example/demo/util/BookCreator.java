package com.example.demo.util;

import com.example.demo.model.Notebook;
import com.example.demo.service.NoteBookServiceINterface;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BookCreator {

    private final NoteBookServiceINterface noteService;

    public BookCreator(NoteBookServiceINterface noteService) {
        this.noteService = noteService;
    }

    @PostConstruct
    public void createDb() {
        noteService.saveNotebook(new Notebook("GamerNotebook", "Sony", "Intel", 50, true, "wood", 2500.0f));
        noteService.saveNotebook(new Notebook("WorkNotebook", "Apple", "Amd", 10, true, "wood", 300.0f));
        noteService.saveNotebook(new Notebook("SimpleNotebook", "Hp", "Intel", 20, true, "wood", 150.0f));
        noteService.saveNotebook(new Notebook("UserNotebook", "Acer", "Amd", 15, true, "wood", 600.0f));
        noteService.saveNotebook(new Notebook("ComfortNoteBook", "Samsung", "Amd", 32, true, "wood", 500.0f));
        noteService.saveNotebook(new Notebook("Top", "Honor", "Amd", 36, true, "silver", 2000.0f));
        noteService.saveNotebook(new Notebook("Middle", "Asus", "Intel", 2, false, "silver", 300.0f));
        noteService.saveNotebook(new Notebook("Bottom", "MSA", "Intel", 20, false, "silver", 100.0f));
        noteService.saveNotebook(new Notebook("GraphicNotebook", "Microsoft", "Intel", 32, true, "silver", 200.0f));
        noteService.saveNotebook(new Notebook("GamerNotebook", "Huawei", "Intel", 64, true, "silver", 0.0f));
        noteService.saveNotebook(new Notebook("GamerNotebook", "Xiaomi", "Intel", 66, false, "silver", 1500.0f));
        noteService.saveNotebook(new Notebook("ComfortNoteBook", "Dell", "Amd", 8, false, "silver", 500.0f));
        noteService.saveNotebook(new Notebook("ComfortNoteBook", "Google", "", 8, true, "silver", 1500.0f));
        noteService.saveNotebook(new Notebook("Top", "Razer", "Amd", 32, true, "aurum", 1500.0f));
        noteService.saveNotebook(new Notebook("GamerNotebook", "Toshiba", "Intel", 32, false, "aurum", 1500.0f));
        noteService.saveNotebook(new Notebook("Top", "Yepo", "Intel", 128, true, "aurum", 800.0f));
        noteService.saveNotebook(new Notebook("Bottom", "Panasonic", "Intel", 2, true, "aurum", 600.0f));
        noteService.saveNotebook(new Notebook("ComfortNoteBook", "Gifabyte", "Intel", 0, true, "aurum", 300.0f));
        noteService.saveNotebook(new Notebook("Top", "Chuwi", "Intel", 64, true, "osmiy", 200.0f));
        noteService.saveNotebook(new Notebook("ComfortNoteBook", "DreamMachine", "Intel", 8, true, "osmiy", 100.0f));
        noteService.saveNotebook(new Notebook("Bottom", "Lenovo", "Intel", 2, true, "osmiy", 1000.0f));
        noteService.saveNotebook(new Notebook("Bottom", "NuVision", "Intel", 2, false, "osmiy", 800.0f));
    }

}

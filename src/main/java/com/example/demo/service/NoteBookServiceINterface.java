package com.example.demo.service;

import com.example.demo.model.Notebook;

import java.util.List;

public interface NoteBookServiceINterface {
    List<Notebook> findAllBook();

    Notebook saveNotebook(Notebook notebook);

    List<Notebook> findAllNotebooksWithMemoryMOreThan(int memory);

    List<Notebook> getAllNoteInOrder();

    List<Notebook> getAllUsedUnusedNotebooks();
}

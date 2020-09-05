package com.example.demo.service;

import com.example.demo.model.Notebook;
import com.example.demo.repository.NotebookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NoteBookService implements NoteBookServiceINterface {
    @Autowired
    private final NotebookRepo noteRepo;

    public NoteBookService(NotebookRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    @Override
    public List<Notebook> findAllBook() {
        return noteRepo.findAll();
    }

    @Override
    public Notebook saveNotebook(Notebook notebook) {
        return noteRepo.save(notebook);
    }

    @Override
    public List<Notebook> findAllNotebooksWithMemoryMOreThan(int memory) {
        return noteRepo.findAllByMemory(memory);
    }

    @Override
    public List<Notebook> getAllNoteInOrder() {
        return noteRepo.findAll()
                .stream().sorted(Comparator.comparing(Notebook::getProducer).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Notebook> getAllUsedUnusedNotebooks() {
        return noteRepo.findAll()
                .stream().filter(Notebook::getUsedUnused)
                .collect(Collectors.toList());
    }

    public List<Notebook> getAllNotebooksWithMemoryLess() {
        return noteRepo.findAll()
                .stream().filter(n -> n.getMemory() > 16).collect(Collectors.toList());
    }

    public Optional<Notebook> findById(Long id) {
        return noteRepo.findById(id);
    }

    public void deleteById(Long id) {
        noteRepo.deleteById(id);
    }
}

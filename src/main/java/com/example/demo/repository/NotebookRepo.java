package com.example.demo.repository;

import com.example.demo.model.Notebook;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotebookRepo extends JpaRepository<Notebook, Long> {
    void deleteById(Long id);

   // Page<Notebook> findAll(Page page);

    Optional<Notebook> findById(Long id);

    @Query("FROM Notebook notebook WHERE notebook.memory >= :memory")
    List<Notebook> findAllByMemory(Integer memory);

}

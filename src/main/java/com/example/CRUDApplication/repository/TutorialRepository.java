package com.example.CRUDApplication.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CRUDApplication.model.Tutorial;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  
  List<Tutorial> findByTitleContainingIgnoreCase(String title);
  // List<Tutorial> findByTitleContainingIgnoreCase(String description);
//  save(Tutorial tutorial);
}

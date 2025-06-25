package com.example.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
     
}

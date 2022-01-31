package com.sparta.mm.pressplaywebsite.repositories;

import com.sparta.mm.pressplaywebsite.entities.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, String> {
}


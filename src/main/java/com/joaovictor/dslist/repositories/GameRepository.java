package com.joaovictor.dslist.repositories;

import com.joaovictor.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

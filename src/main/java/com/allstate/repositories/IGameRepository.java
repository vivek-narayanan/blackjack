package com.allstate.repositories;

import com.allstate.entities.Game;
import org.springframework.data.repository.CrudRepository;

public interface IGameRepository extends CrudRepository <Game, Integer> {
}

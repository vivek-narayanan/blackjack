package com.allstate.services;


import com.allstate.entities.Game;
import com.allstate.repositories.IGameRepository;
import com.allstate.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private IGameRepository gameRepository;
    private IUserRepository userRepository;
    private CardsService cardService;

    @Autowired
    public void setGameRepository(IGameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Autowired
    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setCardService(CardsService cardService) {
        this.cardService = cardService;
    }


}

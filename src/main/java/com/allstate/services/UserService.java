package com.allstate.services;


import com.allstate.entities.User;
import com.allstate.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private IUserRepository repository;

    @Autowired
    public void setRepository(IUserRepository repository) {
        this.repository = repository;
    }

    public User create(User user){
        return this.repository.save(user);
    }

    public Iterable<User> findUsers(){
        return this.repository.findAll();
    }
    public User findById(Integer id){
        return this.repository.findOne(id);
    }


}

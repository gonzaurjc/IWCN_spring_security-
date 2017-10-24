/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app.users;

import com.example.app.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Gonzalo
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUser(String user);
}

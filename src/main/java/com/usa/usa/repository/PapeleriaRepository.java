/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.usa.repository;

import com.usa.usa.crudRepository.PapeleriaCrudRepository;
import com.usa.usa.model.Papeleria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduardsuarez
 */
@Repository
public class PapeleriaRepository {

    @Autowired
    private PapeleriaCrudRepository papeleriaCrudRepository;

    public List<Papeleria> getAll() {
        return (List<Papeleria>) papeleriaCrudRepository.findAll();
    }

    public Optional<Papeleria> getPapeleria(int id) {
        return papeleriaCrudRepository.findById(id);
    }

    public Papeleria save(Papeleria p) {
        return papeleriaCrudRepository.save(p);
    }

}

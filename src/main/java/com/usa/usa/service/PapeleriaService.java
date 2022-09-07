/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.usa.service;

import com.usa.usa.model.Papeleria;
import com.usa.usa.repository.PapeleriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduardsuarez
 */
@Service
public class PapeleriaService {

    @Autowired
    private PapeleriaRepository papeleriaRepository;

    public List<Papeleria> getAll() {
        return papeleriaRepository.getAll();
    }

    public Optional<Papeleria> getPapeleria(int id) {
        return papeleriaRepository.getPapeleria(id);
    }

    public Papeleria save(Papeleria p) {
        if (p.getId() == null) {
            return papeleriaRepository.save(p);
        } else {
            Optional<Papeleria> paux = papeleriaRepository.getPapeleria(p.getId());
            if (paux.isEmpty()) {
                return papeleriaRepository.save(p);
            } else {
                return p;
            }
        }
    }

}

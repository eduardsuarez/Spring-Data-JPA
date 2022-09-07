/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.usa.service;

import com.usa.usa.model.Categoria;
import com.usa.usa.repository.CategoriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduardsuarez
 */
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAll() {
        return categoriaRepository.getAll();
    }

    public Optional<Categoria> getCategoria(int id) {
        return categoriaRepository.getCategoria(id);
    }

    public Categoria save(Categoria p) {
        if (p.getId() == null) {
            return categoriaRepository.save(p);
        } else {
            Optional<Categoria> paux = categoriaRepository.getCategoria(p.getId());
            if (paux.isEmpty()) {
                return categoriaRepository.save(p);
            } else {
                return p;
            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.usa.repository;

import com.usa.usa.crudRepository.CategoriaCrudRepository;
import com.usa.usa.model.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduardsuarez
 */
@Repository
public class CategoriaRepository {

    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getAll(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }
    public Optional<Categoria>getCategoria(int id){
        return categoriaCrudRepository.findById(id);
    }
    public Categoria save(Categoria c){
        return categoriaCrudRepository.save(c);
    }
}

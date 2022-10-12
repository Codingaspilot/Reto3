package ciclo3.reto3.demo.Repositorio;

import ciclo3.reto3.demo.Interface.CategoryInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ciclo3.reto3.demo.Modelo.Category;
import java.util.Optional;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lufel
 */

@Repository

public class CategoryRepository {
 @Autowired
    private CategoryInterface extencionesCrud;
    
    public List<Category> getAll(){
        return (List<Category>) extencionesCrud.findAll();
    }
    
    public Optional<Category> getCategory(int id){
        return extencionesCrud.findById(id);
    }
    
    public Category save(Category category){
        return extencionesCrud.save(category);
    }
    
    
    
}

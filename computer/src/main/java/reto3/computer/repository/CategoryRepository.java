
package reto3.computer.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto3.computer.model.Category;
import reto3.computer.repositorycrud.CategoryRepositoryCrud;

/**
 *
 * @author grupo7
 */
@Repository
public class CategoryRepository {
    @Autowired
    private CategoryRepositoryCrud Crud;
    
    public List<Category> getAll(){
        return(List<Category>) Crud.findAll();
    }
    public Optional<Category> getById(int id){
        return Crud.findById(id);
    }
    
    public Category save(Category category){
        return Crud.save(category);
        
    }

    public Optional<Category> getCategory(int idcategory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Optional<Category> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}
